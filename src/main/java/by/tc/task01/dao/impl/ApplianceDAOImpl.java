package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.impl.Builder.*;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceDAOImpl implements ApplianceDAO {

    File file = new File( Objects.requireNonNull(getClass().getResource("/appliances_db.txt")).getPath());

    @Override
    public List<Appliance> find(Criteria criteria) {
        List<String> wholeGroup = null ;
        List<String> foundAppliance = null;
        List<Appliance> needapplice = null;
        System.out.println("Find by =====> "+criteria.getGroupSearchName()+": " + criteria.getEntry());
        wholeGroup = allGroupSearchName(criteria.getGroupSearchName());
        foundAppliance = findNeedLines(wholeGroup, criteria.getEntry());
        if(foundAppliance != null){
                needapplice = convert(foundAppliance);
        }
        return needapplice;
    }

    // ищем все строки нужной группы ( Oven, Laptop .. )
    private List<String> allGroupSearchName(String groupSearchName) {
        List<String> wholeGroup = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            try {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] cols = line.split(" ");
                    if (cols[0].equals(groupSearchName)) {
                        wholeGroup.add(line);
                    }
                }
            } finally {
                scanner.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return wholeGroup;
    }

    // ищем из всей группы строк строку с нужными параметрами (Height =40, width =60 ...)
    private List<String> findNeedLines(List<String> wholeGroup, String entry) {
        String needline = null;
        List<String> buffer = new ArrayList<>();
        String[] criterias = delimLineCriteria(entry);
        Matcher matcher;
        Pattern pattern;
        for (String criteria : criterias) {
            pattern = Pattern.compile(criteria.toUpperCase() + "(, | \\n |\\t)");
            for (String line : wholeGroup) {
                matcher = pattern.matcher(line.toUpperCase());
                if (matcher.find()) {
                    buffer.add(line);
                }
            }
            wholeGroup.clear();
            wholeGroup.addAll(buffer);
            buffer.clear();
        }
        if (wholeGroup.size() == 0) {
            System.out.println("Not Found");
            return null;
        }
        return wholeGroup;
    }

    // из строки конвертируем в объект и передаем данные в generateAppliance
    private List<Appliance> convert(List<String> lineAppliance) {
        List<Appliance> applianceList = new ArrayList<>();
        Map<String, Object> character = new HashMap<>();
        for (String line : lineAppliance) {
            String[] criterias = delimLineAppliance(line);
            for (int i = 2; i < criterias.length; i++) {
                String[] characretisicAndValue = criterias[i].split("=");
                character.put(characretisicAndValue[0], characretisicAndValue[1]);
            }
            Appliance newAppliance = generateAppliance(criterias[0],character);
            applianceList.add(newAppliance);
        }
        return applianceList;
    }

    // из переданных параметров создаём обьект
    private Appliance generateAppliance(String groupName, Map<String, Object> character){
        Appliance appliance = null;
        switch (groupName) {
            case ("Oven") -> {
                appliance = new OvenBuilder()
                        .setPowerConsumption(Double.parseDouble((String) character.get("POWER_CONSUMPTION")))
                        .setWidth(Double.parseDouble((String) character.get("WEIGHT")))
                        .setCapacity(Double.parseDouble((String) character.get("CAPACITY")))
                        .setDepth(Double.parseDouble((String) character.get("DEPTH")))
                        .setHeight(Double.parseDouble((String) character.get("HEIGHT")))
                        .setWidth(Double.parseDouble((String) character.get("WIDTH")))
                        .createOven();
            }
            case ("TabletPC") -> {
                appliance = new TabletPCBuilder()
                        .setBatteryCapacity(Double.parseDouble((String) character.get("BATTERY_CAPACITY")))
                        .setDisplayInches(Double.parseDouble((String) character.get("DISPLAY_INCHES")))
                        .setMemoryROM(Double.parseDouble((String) character.get("MEMORY_ROM")))
                        .setFlashMemoryCapacity(Double.parseDouble((String) character.get("FLASH_MEMORY_CAPACITY")))
                        .setColor((String) character.get("COLOR"))
                        .createTabletPC();
            }
            case ("Laptop") -> {
                appliance = new LaptopBuilder()
                        .setBatteryCapacity(Double.parseDouble((String) character.get("BATTERY_CAPACITY")))
                        .setMemoryROM(Double.parseDouble((String) character.get("MEMORY_ROM")))
                        .setDisplayInches(Double.parseDouble((String) character.get("DISPLAY_INCHES")))
                        .setOperatingSystem((String) character.get("OS"))
                        .setSystemMemory(Double.parseDouble((String) character.get("SYSTEM_MEMORY")))
                        .setCentralProcessingUnit(Double.parseDouble((String) character.get("CPU")))
                        .createLaptop();

            }
            case ("Refrigerator") -> {
                appliance = new RefrigeratorBuilder()
                        .setPowerConsumption(Double.parseDouble((String) character.get("POWER_CONSUMPTION")))
                        .setWidth(Double.parseDouble((String) character.get("WEIGHT")))
                        .setHeight(Double.parseDouble((String) character.get("HEIGHT")))
                        .setWidth(Double.parseDouble((String) character.get("WIDTH")))
                        .setOverallCapacity(Double.parseDouble((String) character.get("OVERALL_CAPACITY")))
                        .setFreezerCapacity(Double.parseDouble((String) character.get("FREEZER_CAPACITY")))
                        .createRefrigerator();

            }
            case ("VacuumCleaner") -> {
                appliance = new VacuumCleanerBuilder()
                        .setPowerConsumption(Double.parseDouble((String) character.get("POWER_CONSUMPTION")))
                        .setFilterType((String) character.get("FILTER_TYPE"))
                        .setBagType((String) character.get("BAG_TYPE"))
                        .setWandType((String) character.get("WAND_TYPE"))
                        .setMotorSpeedRegulation((String) character.get("MOTOR_SPEED_REGULATION"))
                        .setCleaningWidth(Double.parseDouble((String) character.get("CLEANING_WIDTH")))
                        .createVacuumCleaner();
            }
            case ("Speakers") -> {
                appliance = new SpeakersBuilder()
                        .setPowerConsumption(Double.parseDouble((String) character.get("POWER_CONSUMPTION")))
                        .setNumberOfSpeakers(Integer.parseInt((String) character.get("POWER_CONSUMPTION")))
                        .setFrequencyRange((String) character.get("FREQUENCY_RANGE"))
                        .setCordLength(Double.parseDouble((String) character.get("CORD_LENGTH")))
                        .createSpeakers();
            }
        }
        return appliance;
    }

    private String[] delimLineCriteria(String entry) {
        entry = entry.replace(",", "");
        return entry.split(" ");
    }

    private String[] delimLineAppliance(String lineAppliance) {
        lineAppliance = lineAppliance.replace(",", "");
        lineAppliance = lineAppliance.replace(":", "");
        lineAppliance = lineAppliance.replace(";", "");
        return lineAppliance.split(" ");
    }

}
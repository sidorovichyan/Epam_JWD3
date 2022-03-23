package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.exeption.IncorrectSearchCriteriaExeption;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Validator {

    public static boolean criteriaValidator(Criteria criteria) throws IncorrectSearchCriteriaExeption {
        int col = 0;
        switch (criteria.getGroupSearchName()) {
            case "Oven":
                SearchCriteria.Oven[] ovens = SearchCriteria.Oven.values();
                for (SearchCriteria.Oven crit : ovens) {
                    if (criteria.containMap(crit.toString())) {
                        col++;
                    }
                }
                break;
            case "Laptop":
                SearchCriteria.Laptop[] laptops = SearchCriteria.Laptop.values();
                for (SearchCriteria.Laptop crit : laptops) {
                    if (criteria.containMap(crit.toString())) {
                        col++;
                    }
                }
                break;
            case "Refrigerator":
                SearchCriteria.Refrigerator[] refrigerators = SearchCriteria.Refrigerator.values();
                for (SearchCriteria.Refrigerator crit : refrigerators) {
                    if (criteria.containMap(crit.toString())) {
                        col++;
                    }
                }
                break;
            case "Speakers":
                SearchCriteria.Speakers[] speakers = SearchCriteria.Speakers.values();
                for (SearchCriteria.Speakers crit : speakers) {
                    if (criteria.containMap(crit.toString())) {
                        col++;
                    }
                }
                break;
            case "TabletPC":
                SearchCriteria.TabletPC[] tabletPCS = SearchCriteria.TabletPC.values();
                for (SearchCriteria.TabletPC crit : tabletPCS) {
                    if (criteria.containMap(crit.toString())) {
                        col++;
                    }
                }
                break;
            case "VacuumCleaner":
                SearchCriteria.VacuumCleaner[] vacuumCleaners = SearchCriteria.VacuumCleaner.values();
                for (SearchCriteria.VacuumCleaner crit : vacuumCleaners) {
                    if (criteria.containMap(crit.toString())) {
                        col++;
                    }
                }
                break;
            default:
                throw new IncorrectSearchCriteriaExeption("Incorrect GroupSearchName: " + criteria.getGroupSearchName());
        }
        return col == criteria.getSizeMap();
    }

}

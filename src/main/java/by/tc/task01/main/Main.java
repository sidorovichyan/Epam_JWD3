package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.exeption.IncorrectSearchCriteriaExeption;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Appliance> appliance;
		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
		criteriaOven.add(Oven.CAPACITY.toString(), 33);
		try {
			appliance = service.find(criteriaOven);
			PrintApplianceInfo.print(appliance);
		} catch (IncorrectSearchCriteriaExeption e) {
			System.out.println(e.getMessage());
		}


		//////////////////////////////////////////////////////////////////

		System.out.println();
		criteriaOven = new Criteria(Oven.class.getSimpleName());
		//criteriaOven = new Criteria("Tablo");
		criteriaOven.add(Oven.HEIGHT.toString(), 40);
		criteriaOven.add(Oven.DEPTH.toString(), 60);
		try {
			appliance = service.find(criteriaOven);
			PrintApplianceInfo.print(appliance);
		} catch (IncorrectSearchCriteriaExeption e) {
			System.out.println(e.getMessage());
		}

//
//		//////////////////////////////////////////////////////////////////
//
		System.out.println();
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
	//	criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
	//	criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 4);
		try {
			appliance = service.find(criteriaTabletPC);
			PrintApplianceInfo.print(appliance);
		} catch (IncorrectSearchCriteriaExeption e) {
			System.out.println(e.getMessage());
		}

//
		;// find(Object...obj)

	//	PrintApplianceInfo.print(appliance);

	}

}

package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {
	
	public static void print(List<Appliance> appliance) {
		if(appliance!=null)
			for (Appliance value : appliance) {
				System.out.println(value.toString());
			}
		
	}
}

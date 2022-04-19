package com.java.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class JavaOopDataStore {
	
	// hasEngine + hasRotatingBlades + hasWings + hasGasBalloon + isLargeLoads + isLarge + nbrOfWeels
	public static HashMap<String, String> VehicalsTypeDataStore(){
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1000004", "Car");
		map.put("1100003", "Helicopter");
		map.put("1010019", "Airplane");
		map.put("1010119", "Cargo Airplane");
		map.put("1000014", "Bus");
		map.put("1000002", "Motorcycle");
		map.put("0000002", "Bicycle");
		map.put("0001000", "Airship");
		return map;
		
	}
	
	public static HashMap<String, List<String>> NavigationWayDataStore(){ 
		List<String> roadWay = new ArrayList<String>(Arrays.asList("Car","Bus","Motorcycle","Bicycle")); 
		List<String> airWay  = new ArrayList<String>(Arrays.asList("Helicopter","Airplane","Cargo Airplane","Airship")); 
		HashMap<String, List<String>>  navigationWay = new HashMap<String, List<String>>();
		navigationWay.put("roads", roadWay);
		navigationWay.put("air", airWay);
		return navigationWay;
	}
}

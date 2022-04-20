package com.java.oop.implementations;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

import com.java.oop.JavaOopDataStore;
import com.java.oop.interfaces.IVehical;
import com.java.oop.interfaces.IVehicalImpl;
import com.java.oop.interfaces.NavigationLambda;
import com.java.oop.interfaces.VehicleLambda;
import com.java.oop.models.MVehical;

public class VehicalImpl implements IVehicalImpl {

	private MVehical mv ;
	private IVehical vehical;
	
	public VehicalImpl() {
		mv = new MVehical();
		vehical = new Vehical();
		System.out.println("We instantiated a "+mv.getObjectName()+" object");
	}

	@Override
	public void getVehicalType(Boolean isdefaul) {
		/*
		 * Lambda expressions allow to create a method implementation as an object
		 */
		
		if (!isdefaul) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("- is "+mv.getObjectName()+" has an engin (default N) : ");
			char hasEngine = scanner.nextLine().charAt(0);
			mv.setHasEngine(Character.toUpperCase(hasEngine) == 'Y');
			System.out.print("- is "+mv.getObjectName()+" has Rotating Blades (default N) : ");
			char hasRotatingBlades = scanner.nextLine().charAt(0);
			mv.setHasRotatingBlades(Character.toUpperCase(hasRotatingBlades) == 'Y');
			System.out.print("- is "+mv.getObjectName()+" has Wings (default N) : ");
			char hasWings = scanner.nextLine().charAt(0);
			mv.setHasWings(Character.toUpperCase(hasWings) == 'Y');
			System.out.print("- is "+mv.getObjectName()+" has Gas Balloon (default N) : ");
			char hasGasBalloon = scanner.nextLine().charAt(0);
			mv.setHasGasBalloon(Character.toUpperCase(hasGasBalloon) == 'Y');
			System.out.print("- is "+mv.getObjectName()+" has a Large Loads (default N) : ");
			char isLargeLoads = scanner.nextLine().charAt(0);
			mv.setLargeLoads(Character.toUpperCase(isLargeLoads) == 'Y');
			System.out.print("- is "+mv.getObjectName()+" is Large (default N) : ");
			char isLarge = scanner.nextLine().charAt(0);
			mv.setLarge(Character.toUpperCase(isLarge) == 'Y');
			System.out.print("- number of weels (default 0) : ");
			int nbrOfWeels = scanner.nextInt();
			mv.setNbrOfWeels(nbrOfWeels);
			scanner.close();
			vehical.vehicalType(getVehicleLambda(), mv);
			System.out.println(" ");
			System.out.println("--------------------------------------------------");
			System.out.println("the type of my "+mv.getObjectName()+" is : " + mv.getVehicalType());
			System.out.println("--------------------------------------------------");
		} else
			vehical.vehicalType(getVehicleLambdaDefault(), mv);
	}

	public VehicleLambda getVehicleLambda() {
		return v -> {
			StringBuffer str = new StringBuffer();
			str.append(v.isHasEngine() ? "1" : "0");
			str.append(v.isHasRotatingBlades() ? "1" : "0");
			str.append(v.isHasWings() ? "1" : "0");
			str.append(v.isHasGasBalloon() ? "1" : "0");
			str.append(v.isLargeLoads() ? "1" : "0");
			str.append(v.isLarge() ? "1" : "0");
			str.append(v.getNbrOfWeels());

			HashMap<String, String> map = JavaOopDataStore.VehicalsTypeDataStore();

			v.setVehicalType("Undefined");
			if (map.containsKey(str.toString()))
				v.setVehicalType(map.get(str.toString()));

		};
	}

	public VehicleLambda getVehicleLambdaDefault() {
		return v -> {
			System.out.println("The default implementation of the method printVehicleType(MVehical Vehical)");
		};
	}

	@Override
	public void getNavigationType() {
		if (!mv.getVehicalType().equalsIgnoreCase("")) {
			String str = "Undefined Navigation Way";
			HashMap<String, List<String>> map = JavaOopDataStore.NavigationWayDataStore();
			
			for(Entry<String, List<String>> entry :  map.entrySet()) {
				if(entry.getValue().contains(mv.getVehicalType())) {
					str = "This "+mv.getObjectName()+" navigate through "+entry.getKey();
					break;
				} 
			}
			
			vehical.navigateThrough(getavigationLambda(str));
			return;

		}
		System.out.println("");
		System.out.println("You must enter the specifications");
		getVehicalType(false);
		getNavigationType();
	}

	public NavigationLambda getavigationLambda(String str) {

		return () -> {
			System.out.println("");
			System.out.println("--------------------------------------------------");
			System.out.println(str);
			System.out.println("--------------------------------------------------");

		};

	}

}

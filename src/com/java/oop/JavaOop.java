package com.java.oop;

import java.util.HashMap;
import java.util.Scanner;

public class JavaOop {

	public static void main(String[] args) {

		getVehicalType(false);

	}

	public static void getVehicalType(Boolean isdefaul) {
		/*
		 * Lambda expressions allow to create a method implementation as an object
		 */

		MVehical mv = new MVehical();
		Vehical vehical = new Vehical();
		if (!isdefaul) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("- is Vehical has an engin (default N) : ");
			char hasEngine = scanner.nextLine().charAt(0);
			mv.setHasEngine(Character.toUpperCase(hasEngine) == 'Y');
			System.out.print("- is Vehical has Rotating Blades (default N) : ");
			char hasRotatingBlades = scanner.nextLine().charAt(0);
			mv.setHasRotatingBlades(Character.toUpperCase(hasRotatingBlades) == 'Y');
			System.out.print("- is Vehical has Wings (default N) : ");
			char hasWings = scanner.nextLine().charAt(0);
			mv.setHasWings(Character.toUpperCase(hasWings) == 'Y');
			System.out.print("- is Vehical has Gas Balloon (default N) : ");
			char hasGasBalloon = scanner.nextLine().charAt(0);
			mv.setHasGasBalloon(Character.toUpperCase(hasGasBalloon) == 'Y');
			System.out.print("- is Vehical has a Large Loads (default N) : ");
			char isLargeLoads = scanner.nextLine().charAt(0);
			mv.setLargeLoads(Character.toUpperCase(isLargeLoads) == 'Y');
			System.out.print("- is Vehical is Large (default N) : ");
			char isLarge = scanner.nextLine().charAt(0);
			mv.setLarge(Character.toUpperCase(isLarge) == 'Y');
			System.out.print("- number of weels (default 0) : ");
			int nbrOfWeels = scanner.nextInt();
			mv.setNbrOfWeels(nbrOfWeels);
			scanner.close();
			vehical.vehicalType(getVehicleLambda(), mv);
			System.out.print(" ");
			System.out.println("--------------------------------------------------");
			System.out.println("the type of my vehical is : " + mv.getVehicalType());
			System.out.println("--------------------------------------------------");
		} else
			vehical.vehicalType(getVehicleLambdaDefault(), mv);
	}

	public static VehicleLambda getVehicleLambda() {
		return v -> {
			StringBuffer str = new StringBuffer();
			str.append(v.isHasEngine() ? "1" : "0");
			str.append(v.isHasRotatingBlades() ? "1" : "0");
			str.append(v.isHasWings() ? "1" : "0");
			str.append(v.isHasGasBalloon() ? "1" : "0");
			str.append(v.isLargeLoads() ? "1" : "0");
			str.append(v.isLarge() ? "1" : "0");
			str.append(v.getNbrOfWeels());

			// hasEngine + hasRotatingBlades + hasWings + hasGasBalloon + isLargeLoads +
			// isLarge + nbrOfWeels
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("1000004", "Car");
			map.put("1100003", "Helicopter");
			map.put("1010019", "Airplane");
			map.put("1010119", "Cargo Airplane");
			map.put("1000014", "Bus");
			map.put("1000002", "Motorcycle");
			map.put("0000002", "Bicycle");
			map.put("0001000", "Airship");

			v.setVehicalType("no vehical exists with this discription");
			if (map.containsKey(str.toString()))
				v.setVehicalType(map.get(str.toString()));

		};
	}

	public static VehicleLambda getVehicleLambdaDefault() {
		return v -> {
			System.out.println("The default implementation of the method  printVehicleType(MVehical Vehical)");
		};
	}

}

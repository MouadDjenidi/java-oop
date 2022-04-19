package com.java.oop.implementations;

import com.java.oop.interfaces.IVehical;
import com.java.oop.interfaces.NavigationLambda;
import com.java.oop.interfaces.VehicleLambda;
import com.java.oop.models.MVehical;

public class Vehical implements IVehical{

	@Override
	public void vehicalType(VehicleLambda lambda, MVehical vehical) {
		lambda.printVehicleType(vehical);
		
	}

	@Override
	public void navigateThrough(NavigationLambda lambda) {
		lambda.PrintVehicalNavigation();
	}
}

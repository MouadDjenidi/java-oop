package com.java.oop;

import com.java.oop.implementations.VehicalImpl;
import com.java.oop.interfaces.IVehicalImpl;

public class JavaOop {
 
	public static void main(String[] args) {
        /* get information about a vehicale */
		
		IVehicalImpl ivi = new VehicalImpl();
		ivi.getVehicalType(false);
		ivi.getNavigationType();

	}
}

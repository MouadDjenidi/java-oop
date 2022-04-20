package com.java.oop;

import com.java.oop.implementations.VehicalImpl;
import com.java.oop.interfaces.IVehicalImpl;

public class JavaOop {
 
	public static void main(String[] args) {
        /* get information about a vehicale */
		
		//IVehicalImpl ivi = new VehicalImpl();
		//ivi.getVehicalType(false);
		//ivi.getNavigationType();
		
		int indexFrom =  "ALTER TABLE C_ORDER MODIFY DOCUMENTNO VARCHAR2( 100 ) NOT NULL".toUpperCase().indexOf(" MODIFY ");
		int indexTo =  "ALTER TABLE C_ORDER MODIFY  MODIFY DOCUMENTNO VARCHAR2( 100 ) NOT NULL".toUpperCase().lastIndexOf(" MODIFY ");
		String indexl =  "ALTER TABLE C_ORDER MODIFY  MODIFY DOCUMENTNO VARCHAR2( 100 ) NOT NULL".toUpperCase().replaceFirst("MODIFY", "unMODIFY");
		System.out.println(indexFrom+" "+indexTo+ " "+indexl );

	}
}

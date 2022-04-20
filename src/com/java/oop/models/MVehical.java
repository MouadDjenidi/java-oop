package com.java.oop.models;

import lombok.Data;

@Data
public class MVehical extends SModel {
	
	public MVehical(){
		setObjectName("Vehicale");
	};
	
	private boolean hasGasBalloon = false;
	private boolean hasWings = false;
	private boolean hasEngine = false;
	private boolean hasRotatingBlades = false;
	private boolean isLargeLoads = false;
	private boolean isLarge = false;
	private int nbrOfWeels = 0;
	private String  VehicalType = "";
	
}

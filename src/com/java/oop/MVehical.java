package com.java.oop;

public class MVehical {
	
	private boolean hasGasBalloon = false;
	private boolean hasWings = false;
	private boolean hasEngine = false;
	private boolean hasRotatingBlades = false;
	private boolean isLargeLoads = false;
	private boolean isLarge = false;
	private int nbrOfWeels = 0;
	private String  VehicalType;
	
	
	public boolean isHasGasBalloon() {
		return hasGasBalloon;
	}
	public void setHasGasBalloon(boolean hasGasBalloon) {
		this.hasGasBalloon = hasGasBalloon;
	}
	public boolean isHasWings() {
		return hasWings;
	}
	public void setHasWings(boolean hasWings) {
		this.hasWings = hasWings;
	}
	public boolean isHasEngine() {
		return hasEngine;
	}
	public void setHasEngine(boolean hasEngine) {
		this.hasEngine = hasEngine;
	}
	public boolean isHasRotatingBlades() {
		return hasRotatingBlades;
	}
	public void setHasRotatingBlades(boolean hasRotatingBlades) {
		this.hasRotatingBlades = hasRotatingBlades;
	}
	public boolean isLargeLoads() {
		return isLargeLoads;
	}
	public void setLargeLoads(boolean isLargeLoads) {
		this.isLargeLoads = isLargeLoads;
	}
	public boolean isLarge() {
		return isLarge;
	}
	public void setLarge(boolean isLarge) {
		this.isLarge = isLarge;
	}
	public int getNbrOfWeels() {
		return nbrOfWeels;
	}
	public void setNbrOfWeels(int nbrOfWeels) {
		this.nbrOfWeels = nbrOfWeels;
	}
	public String getVehicalType() {
		return VehicalType;
	}
	public void setVehicalType(String vehicalType) {
		VehicalType = vehicalType;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MVehical other = (MVehical) obj;
		if (VehicalType == null) {
			if (other.VehicalType != null)
				return false;
		} else if (!VehicalType.equals(other.VehicalType))
			return false;
		if (hasEngine != other.hasEngine)
			return false;
		if (hasGasBalloon != other.hasGasBalloon)
			return false;
		if (hasRotatingBlades != other.hasRotatingBlades)
			return false;
		if (hasWings != other.hasWings)
			return false;
		if (isLarge != other.isLarge)
			return false;
		if (isLargeLoads != other.isLargeLoads)
			return false;
		if (nbrOfWeels != other.nbrOfWeels)
			return false;
		return true;
	}
	

}

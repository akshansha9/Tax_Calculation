package com.shalem.tax.taxproperty;

import com.shalem.tax.calculation.TaxCalculation;

public class AddProperty {
	
	public double baseValue;
	public int buildUpLand;
	public int ageOfLand;
	public String landLocatedInCity;
	public double tax;
	public AddProperty(double baseValue, int buildUpLand, int ageOfLand, String landLocatedInCity) {
		super();
		this.baseValue = baseValue;
		this.buildUpLand = buildUpLand;
		this.ageOfLand = ageOfLand;
		this.landLocatedInCity = landLocatedInCity;
		
		
	}
	
	

	@Override
	public String toString() {
		return "baseValue=" + baseValue + ", buildUpLand=" + buildUpLand + ", ageOfLand=" + ageOfLand
				+ ", landLocatedInCity=" + landLocatedInCity + ", tax=" + tax ;
	}



	public double getBaseValue() {
		return baseValue;
	}

	public void setBaseValue(double baseValue) {
		this.baseValue = baseValue;
	}

	public int getBuildUpLand() {
		return buildUpLand;
	}

	public void setBuildUpLand(int buildUpLand) {
		this.buildUpLand = buildUpLand;
	}

	public int getAgeOfLand() {
		return ageOfLand;
	}

	public void setAgeOfLand(int ageOfLand) {
		this.ageOfLand = ageOfLand;
	}

	public String getLandLocatedInCity() {
		return landLocatedInCity;
	}

	public void setLandLocatedInCity(String landLocatedInCity) {
		this.landLocatedInCity = landLocatedInCity;
	}

	public double getTax() {
		return tax;
		}
	public void setTax() {
		this.tax=tax;
	}

	
	

}

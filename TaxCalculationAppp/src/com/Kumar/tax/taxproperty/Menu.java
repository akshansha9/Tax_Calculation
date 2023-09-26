package com.kumar.tax.taxproperty;

import java.util.Scanner;

public class Menu {
	Scanner sc=new Scanner(System.in);
	public int choice2;
	public void menuDisplay() {
		System.out.println("1. PROPERTY TAX");
		System.out.println("2. VEHICLE TAX");
		System.out.println("3. TOTAL");
		System.out.println("4. EXIT");
	}
	public void propertyTax() {
		System.out.println("1. ADD PROPERTY DETAILS");
		System.out.println("2. CALCULATE PROPERTY TAX");
		System.out.println("3. DISPLAY ALL PROPERTIES");
		System.out.println("4. BACK TO MAIN MENU");
	
		
	}
	public void vehicleMenu() {
		System.out.println("1. ADD VEHICLE DETAILS");
		System.out.println("2. CALCULATE VEHICLE TAX");
		System.out.println("3. DISPLAY ALL VEHICLES");
		System.out.println("4. BACK TO MAIN MENU");

	}
	public void vehicleType() {
		System.out.println("CHOOSE THE VEHICLE TYPE -");
		System.out.println("1. PETROL DRIVEN");
		System.out.println("2. DIESEL DRIVEN");
		System.out.println("3. CNG/LPG DRIVEN");
	}
	
}



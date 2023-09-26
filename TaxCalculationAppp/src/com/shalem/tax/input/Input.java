package com.shalem.tax.input;

import java.util.Scanner;

import com.shalem.tax.taxproperty.AddProperty;
import com.shalem.tax.taxproperty.AddVehicle;

public class Input {
	
	private String userName;
	private String password;
	private int propertyId;
	Scanner sc=new Scanner(System.in);
	
	
	public void LoginInput() {
		System.out.println("PLEASE LOGIN TO CONTINUE");
		System.out.print("USERNAME:");
		userName=sc.nextLine();
		System.out.print("PASSWORD:");
		password=sc.nextLine();
		if ("admin".equals(userName) && "admin123".equals(password)){
			System.out.println("login successful");
		}else{
			System.out.println("Invalid username/password");
			LoginInput();
		}
		
	}
	public AddProperty propertyInput() {
		double basevalue;
		int builtArea;
		int age;
		String locationArea;
		System.out.println("ENTER PROPERTY DETAILS -");
		System.out.print("Enter THE BASE VALUE OF LAND -");
		basevalue=sc.nextDouble();
		System.out.print("ENTER BUILD UP AREA OF LAND -");
		builtArea=sc.nextInt();
		System.out.print("ENTER THE AGE OFLAND IN YEARS -");
		age=sc.nextInt();
		System.out.print("IS THE LAND LOCATED IN CITY?(Y:YES, N:NO) -");
		locationArea=sc.next();
		AddProperty a1=new AddProperty(basevalue,builtArea,age,locationArea);
		return a1;
		
	}
	public int getPropertyId() {
		
		System.out.print("ENTER THE PROPERTY ID TO CALCULATE THE TAX -");
		propertyId=sc.nextInt();
		return propertyId;
		
	}
	public AddVehicle vehicleInput() {
		
		String registrationNumber;
	    String brand;
	    double purchaseCost;
	    double maxVelocity;
	    int capacity;
		
		 System.out.print("ENTER THE VEHICLE REGISTRATION NUMBER: ");
         registrationNumber = sc.next();
         System.out.print("ENTER BRAND OF THE VEHICLE: ");
         brand = sc.next();
         System.out.print("ENTER THE MAXIMUM VELOCITY OF THE VEHICLE(KMPH): ");
         maxVelocity = sc.nextDouble();
         System.out.print("ENTER CAPACITY(NUMBER OF SEATS) OF THE VEHICLE -");
         capacity = sc.nextInt();
         
         AddVehicle av=new AddVehicle(registrationNumber,brand,maxVelocity,capacity);
         return av;

	}
	
	public AddVehicle modelInput(int choice, AddVehicle av) {
		
		if(choice==1) {
			av.setVehicleType("PETROL");
			
		}
		else if(choice==2){
			av.setVehicleType("DIESEL");
		}
		else if(choice==3){
			av.setVehicleType("CNG/LPG");
		}
		return av;
	}
	
	public AddVehicle getCost(AddVehicle av) {
		double cost;
		System.out.print("ENTER THE PURCHASE COST OF THE VEHICLE - ");
		cost = sc.nextDouble();
		
		av.setPurchaseCost(cost);
		return av;
	}
	public String getVehReg() {
		System.out.print("ENTER THE REGISTRATION NO OF  VEHICLE TO CALCULATE THE TAX-");
		String getReg=sc.next();
		return getReg;
	}
	public AddVehicle Tax(AddVehicle av) {
		if(av.vehicleType=="PETROL") {
			av.tax=av.maxVelocity+av.capacity+0.1*av.purchaseCost;
		}
		else if(av.vehicleType=="DIESEL") {
			av.tax=av.maxVelocity+av.capacity+0.11*av.purchaseCost;
		}
		else if(av.vehicleType=="CNG/LPG") {
			av.tax=av.maxVelocity+av.capacity+0.11*av.purchaseCost;
		}
		return av;
	}
	public AddProperty tax(AddProperty ap) {
		double tax;
		if(ap.getLandLocatedInCity().equals("Y")) {
			ap.tax=(ap.baseValue*ap.buildUpLand*ap.ageOfLand)+(0.5*ap.buildUpLand);
		}
		else {
			ap.tax=(ap.baseValue*ap.buildUpLand*ap.ageOfLand);
			
			
		}
		return ap;
	}

}

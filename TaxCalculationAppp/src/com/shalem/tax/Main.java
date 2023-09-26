package com.shalem.tax;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.shalem.tax.calculation.TaxCalculation;
import com.shalem.tax.display.Display;
import com.shalem.tax.input.Input;
import com.shalem.tax.taxproperty.AddProperty;
import com.shalem.tax.taxproperty.AddVehicle;
import com.shalem.tax.taxproperty.Menu;

public class Main {

	public static void main(String[] args) {
		int choice1,choice2,propertyCount;
		ArrayList <AddProperty> l1=new ArrayList();
		ArrayList<AddVehicle> av=new ArrayList();
		Display d=new Display();
		Total tot=new Total();
		TaxCalculation t=new TaxCalculation();
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO TAX CALCULATION APP");
		Input in=new Input();
		in.LoginInput();
		Menu menu=new Menu();
		menu.menuDisplay();
		
		while(true) {
			choice1=sc.nextInt();
		switch(choice1) {		
				case 1:
					while(true) {
						menu.propertyTax();
						choice2=sc.nextInt();
						if(choice2==1) {
								AddProperty propertyInput = in.propertyInput();
								propertyInput=in.tax(propertyInput);
								l1.add(propertyInput);
								continue;
						}
						if(choice2==2) {
							int prodId=in.getPropertyId();
							AddProperty addProperty = l1.get(prodId-1);
							t.PropTax(addProperty,prodId);
							continue;
						}
							if(choice2==3) {
								
								d.propDisplay(l1);
								continue;
							}
							if(choice2==4) {
								menu.menuDisplay();
								break;
								
							}
							break;
							
							
						
					}
					break;
				case 2:
					while(true) {
							menu.vehicleMenu();
							choice2=sc.nextInt();
							if(choice2==1) {
								AddVehicle vehicleInput = in.vehicleInput();
								menu.vehicleType();
								int choice=sc.nextInt();
								vehicleInput=in.modelInput(choice,vehicleInput);
								vehicleInput=in.getCost(vehicleInput);
								vehicleInput=in.Tax(vehicleInput);
								av.add(vehicleInput);
								continue;
							}
							if(choice2==2) {
								
								String vehReg=in.getVehReg();
								t.vehTax(av,vehReg);
								
								continue;
							}
							if(choice2==3) {
								d.vehDisplay(av);
								continue;
							}
							if(choice2==4) {
								menu.menuDisplay();
								break;
							}
			break;
					
					}
					break;
					
				case 3:
					
					tot.getTotalsize(l1,av);
					tot.getTotalTax(l1, av);
					menu.menuDisplay();
					break;
				case 4:
					System.out.println("THANKS VISIT AGAIN.");
					break;
			
					
		}
				
		}
		
		

	}

}

package com.shalem.tax;

import java.util.ArrayList;

import com.shalem.tax.taxproperty.AddProperty;
import com.shalem.tax.taxproperty.AddVehicle;

public class Total {
	
	
	
	
	public void getTotalsize(ArrayList<AddProperty> ap,ArrayList<AddVehicle> av) {

		int totalQuantity = ap.size()+av.size();
		System.out.println("ToTal Quantity" + totalQuantity);
	}
	public void getTotalTax(ArrayList<AddProperty> ap,ArrayList<AddVehicle> av) {
		double propTotal=0.0;
		double vehTotal=0.0;
		for(AddProperty a:ap) {
			propTotal+=a.getTax();
			
		}
		for(AddVehicle a:av) {
			vehTotal+=a.getTax();
			
		}
		double totalTax = propTotal+vehTotal;
		System.out.println("TOTAL TAX IS" + totalTax);
		
		
	}
	
	}


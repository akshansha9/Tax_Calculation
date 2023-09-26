package com.shalem.tax.display;

import java.util.ArrayList;

import com.shalem.tax.taxproperty.AddProperty;
import com.shalem.tax.taxproperty.AddVehicle;

public class Display {
	
	double propTax=0.0;
	
	public void propTotalTax(ArrayList<AddProperty> l1) {
		
		for(AddProperty l:l1) {
			propTax+=l.getTax();
			
		}
		System.out.println(propTax);
	}
		public void propDisplay(ArrayList<AddProperty> l1) {
			
			for(AddProperty l:l1) {
				System.out.println(l);
				
			}
		}
		public void vehDisplay(ArrayList<AddVehicle> av) {
			
			for(AddVehicle l:av) {
				System.out.println(l);
				
			}
		}
		
		
		

		public void getTotalSize(int s1) {
			System.out.println(s1);
		}
	
	

}

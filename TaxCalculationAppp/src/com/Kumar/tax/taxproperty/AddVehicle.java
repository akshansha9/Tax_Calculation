package com.kumar.tax.taxproperty;

public class AddVehicle {
	 	public String registrationNumber;
	    public String brand;
	    public double purchaseCost=0.0;
	    public double maxVelocity;
	    public int capacity;
	    public String vehicleType=null;
	    public double tax;
		public AddVehicle(String registrationNumber, String brand,double maxVelocity,int capacity) {
			super();
			this.registrationNumber = registrationNumber;
			this.brand = brand;
			this.maxVelocity = maxVelocity;
			this.capacity = capacity;
		}
		public String getRegistrationNumber() {
			return registrationNumber;
		}
		public void setRegistrationNumber(String registrationNumber) {
			this.registrationNumber = registrationNumber;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public double getPurchaseCost() {
			return purchaseCost;
		}
		public void setPurchaseCost(double purchaseCost) {
			this.purchaseCost = purchaseCost;
		}
		public double getMaxVelocity() {
			return maxVelocity;
		}
		
		public void setMaxVelocity(double maxVelocity) {
			this.maxVelocity = maxVelocity;
		}
		public int getCapacity() {
			return capacity;
		}
		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		public String getVehicleType() {
			return vehicleType;
		}
		public void setVehicleType(String vehicleType) {
			this.vehicleType = vehicleType;
		}
		
		public void setTax(double tax) {
			this.tax=tax;
			
		}
		public double getTax() {
			return tax;
		}
		@Override
		public String toString() {
			return "[registrationNumber=" + registrationNumber + ", brand=" + brand + ", purchaseCost="
					+ purchaseCost + ", maxVelocity=" + maxVelocity + ", capacity=" + capacity + ", vehicleType="
					+ vehicleType + ", tax=" + tax + "]";
		}
		
		
		
		
		
		
		
	    
	    
	    


}

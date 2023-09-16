package ssMVC.model;

public class Motors extends Vehicle {
    private int capacity;

    public Motors(int vehicleId, String companyName, int year, String ownerName, int capacity) {
        super(vehicleId, companyName, year, ownerName);
        this.capacity = capacity;
    }
    public Motors(){

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return getCompanyName()+ "license plate number " +
                getVehicleId() + " has the year of manufacture " +
                getYear()+  " with engine capacity "+ capacity +
                " , owner name is: " + getOwnerName();
    }
}

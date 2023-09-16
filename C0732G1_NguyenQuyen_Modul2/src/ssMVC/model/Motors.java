package ssMVC.model;

public class Motors extends Vehicle {
    private int wattage;

    public Motors(int vehicleId, String companyName, int year, int ownerName, int wattage) {
        super(vehicleId, companyName, year, ownerName);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }
    @Override
    public String toString() {
        return getCompanyName()+ "license plate number " +
                getVehicleId() + " has the year of manufacture " +
                getYear()+  " with engine capacity "+ wattage +
                " , owner name is: " + getOwnerName();
    }
}

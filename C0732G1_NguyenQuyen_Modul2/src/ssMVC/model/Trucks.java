package ssMVC.model;

public class Trucks extends Vehicle {
    private int load;

    public Trucks(int vehicleId, String companyName, int year, int ownerName, int load) {
        super(vehicleId, companyName, year, ownerName);
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return getCompanyName()+ "license plate number " +
                getVehicleId() + " has the year of manufacture " +
                getYear()+  " with play load "+ load +
                " , owner name is: " + getOwnerName();
    }
}

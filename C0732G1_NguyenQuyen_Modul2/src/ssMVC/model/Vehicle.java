package ssMVC.model;

public abstract class Vehicle {
    private int vehicleId;
    private String companyName;
    private int year;
    private String ownerName;


    public Vehicle(int vehicleId, String companyName, int year, String ownerName) {
        this.vehicleId = vehicleId;
        this.companyName = companyName;
        this.year = year;
        this.ownerName = ownerName;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public Vehicle(){

    }

    @Override
    public String toString() {
        return companyName+ "license plate number " +
                vehicleId + " has the year of manufacture " +
                year+ " , owner name is: " + ownerName;
    }
}

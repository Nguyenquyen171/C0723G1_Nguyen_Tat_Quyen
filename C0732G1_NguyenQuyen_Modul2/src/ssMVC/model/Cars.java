package ssMVC.model;

public class Cars extends Vehicle {
    private int numberSeats;
    private String carType;

    public Cars(int vehicleId, String companyName, int year, int ownerName, int numberSeats, String carType) {
        super(vehicleId, companyName, year, ownerName);
        this.numberSeats = numberSeats;
        this.carType = carType;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return getCompanyName()+ "license plate number " +
                getVehicleId() + " has the year of manufacture " +
                getYear()+  " with= number of seats  " + getNumberSeats()+
                " and car type :" + getCarType() +
                " , owner name is: " + getOwnerName();
    }
}

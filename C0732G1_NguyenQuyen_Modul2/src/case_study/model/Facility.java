package case_study.model;

public abstract class Facility {
    private int idPlace;
    private String namePlace;
    private double areaPlace;
    private double pricePlace;
    private int quantityPeople;

    public Facility(int idPlace, String namePlace, double areaPlace, double pricePlace, int quantityPeople) {
        this.idPlace = idPlace;
        this.namePlace = namePlace;
        this.areaPlace = areaPlace;
        this.pricePlace = pricePlace;
        this.quantityPeople = quantityPeople;
    }

    public int getIdPlace() {
        return idPlace;
    }

    public void setIdPlace(int idPlace) {
        this.idPlace = idPlace;
    }

    public String getNamePlace() {
        return namePlace;
    }

    public void setNamePlace(String namePlace) {
        this.namePlace = namePlace;
    }

    public double getAreaPlace() {
        return areaPlace;
    }

    public void setAreaPlace(double areaPlace) {
        this.areaPlace = areaPlace;
    }

    public double getPricePlace() {
        return pricePlace;
    }

    public void setPricePlace(double pricePlace) {
        this.pricePlace = pricePlace;
    }

    public int getQuantityPeople() {
        return quantityPeople;
    }

    public void setQuantityPeople(int quantityPeople) {
        this.quantityPeople = quantityPeople;
    }
}

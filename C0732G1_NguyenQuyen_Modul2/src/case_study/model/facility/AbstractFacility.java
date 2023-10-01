package case_study.model.facility;

public abstract class AbstractFacility {
    private String  idPlace;
    private String namePlace;
    private double areaPlace;
    private double pricePlace;
    private int quantityPeople;

    public AbstractFacility(String idPlace, String namePlace, double areaPlace, double pricePlace, int quantityPeople) {
        this.idPlace = idPlace;
        this.namePlace = namePlace;
        this.areaPlace = areaPlace;
        this.pricePlace = pricePlace;
        this.quantityPeople = quantityPeople;
    }

    public String getIdPlace() {
        return idPlace;
    }

    public void setIdPlace(String idPlace) {
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

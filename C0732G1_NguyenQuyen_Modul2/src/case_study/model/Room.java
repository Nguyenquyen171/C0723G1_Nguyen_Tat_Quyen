package case_study.model;

public class Room extends Facility {
    private String freeService;

    public Room(int idPlace, String namePlace, double areaPlace, double pricePlace, int quantityPeople, String freeService) {
        super(idPlace, namePlace, areaPlace, pricePlace, quantityPeople);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }
    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}

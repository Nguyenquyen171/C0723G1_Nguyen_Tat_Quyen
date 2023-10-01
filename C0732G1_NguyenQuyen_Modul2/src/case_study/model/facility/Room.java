package case_study.model.facility;

public class Room extends AbstractFacility {
    private String freeService;

    public Room(String idPlace, String namePlace, double areaPlace, double pricePlace, int quantityPeople, String freeService) {
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

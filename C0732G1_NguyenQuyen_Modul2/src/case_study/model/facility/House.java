package case_study.model.facility;

public class House extends AbstractFacility {
    private String roomStandards;
    private int floorsNumber;

    public House(String idPlace, String namePlace, double areaPlace, double pricePlace, int quantityPeople, String roomStandards, int floorsNumber) {
        super(idPlace, namePlace, areaPlace, pricePlace, quantityPeople);
        this.roomStandards = roomStandards;
        this.floorsNumber = floorsNumber;
    }
    public String getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(String roomStandards) {
        this.roomStandards = roomStandards;
    }

    public int getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }
}

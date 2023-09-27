package case_study.model;

public class House extends Facility {
    private String roomStandards;
    private int floorsNumber;

    public House(int idPlace, String namePlace, double areaPlace, double pricePlace, int quantityPeople, String roomStandards, int floorsNumber) {
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

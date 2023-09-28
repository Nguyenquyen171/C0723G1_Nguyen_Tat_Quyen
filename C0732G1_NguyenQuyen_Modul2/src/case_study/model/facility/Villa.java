package case_study.model.facility;

public class Villa extends Facility {
    private String roomStandards;
    private String areaPool;

    public Villa(int idPlace, String namePlace, double areaPlace, double pricePlace, int quantityPeople, String roomStandards, String areaPool) {
        super(idPlace, namePlace, areaPlace, pricePlace, quantityPeople);
        this.roomStandards = roomStandards;
        this.areaPool = areaPool;
    }

    public String getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(String roomStandards) {
        this.roomStandards = roomStandards;
    }

    public String getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(String areaPool) {
        this.areaPool = areaPool;
    }
}

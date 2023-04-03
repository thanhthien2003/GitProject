package case_study.models.facility;

public class House extends Facility {
    private int floor;
    private String roomStandard;
    public House() {
    }

    public House(String serviceName, int areaUse, float price, int maxHuman, String styleRent, String idService, int floor, String roomStandard) {
        super(serviceName, areaUse, price, maxHuman, styleRent, idService);
        this.floor = floor;
        this.roomStandard = roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    @Override
    public String toString() {
        return "House{" +
                "floor=" + floor +
                ", roomStandard='" + roomStandard + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", areaUse=" + areaUse +
                ", price=" + price +
                ", maxHuman=" + maxHuman +
                ", styleRent='" + styleRent + '\'' +
                ", idService='" + idService + '\'' +
                '}';
    }
}

package case_study.models.facility;

import case_study.models.facility.ClassFacility;

public class House extends ClassFacility {
    private int floor;
    private String roomStandard;
    public House() {
    }

    public House(String serviceName, int areaUse, float price, int maxHuman, String styleRent,String roomStandard,int floor) {
        super(serviceName, areaUse, price, maxHuman, styleRent);
        this.roomStandard = roomStandard;
        this.floor = floor;
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
                '}';
    }
}

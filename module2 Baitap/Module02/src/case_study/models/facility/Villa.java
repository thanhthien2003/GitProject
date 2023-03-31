package case_study.models.facility;

import case_study.models.facility.ClassFacility;

public class Villa extends ClassFacility {
    private int areaPool;
    private int floor;
    private String roomStandard;
    public Villa() {
    }

    public Villa(String serviceName, int areaUse, float price, int maxHuman, String styleRent,int areaPool,int floor,String roomStandard) {
        super(serviceName, areaUse, price, maxHuman, styleRent);
        this.areaPool = areaPool;
        this.floor = floor;
        this.roomStandard = roomStandard;
    }

    public int getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(int areaPool) {
        this.areaPool = areaPool;
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
        return "Villa{" +
                "areaPool=" + areaPool +
                ", floor=" + floor +
                ", roomStandard='" + roomStandard + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", areaUse=" + areaUse +
                ", price=" + price +
                ", maxHuman=" + maxHuman +
                ", styleRent='" + styleRent + '\'' +
                '}';
    }
}

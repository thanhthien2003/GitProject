package case_study_again.models.facilitys;

import java.util.Objects;

public class Villa extends Facility{
    private float areaPool;
    private int floor;
    private String roomStandard;
    public Villa() {
    }

    public Villa(String serviceName, int areaUse, float price, int maxHuman, String styleRent, String idService, float areaPool, int floor, String roomStandard) {
        super(serviceName, areaUse, price, maxHuman, styleRent, idService);
        this.areaPool = areaPool;
        this.floor = floor;
        this.roomStandard = roomStandard;
    }

    public float getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(float areaPool) {
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
                "serviceName=" + serviceName +
                ",areaUse=" + areaUse +
                ", price='" + price + '\'' +
                ", maxHuman='" + maxHuman + '\'' +
                ", styleRent=" +styleRent+
                ", idService=" + idService +
                ", areaPool=" + areaPool +
                ", floor='" + floor + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                '}';
    }

    public String getInforVilla(){
        return serviceName +"," + areaUse +"," + price +"," + maxHuman +"," + styleRent+"," + idService+"," + areaPool+
                "," + floor+"," + roomStandard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Villa villa = (Villa) o;
        return this.idService.equals(villa.idService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaPool, floor, roomStandard);
    }
}

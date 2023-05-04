package case_study_again.models.facilitys;

import java.util.Objects;

public class House extends Facility{
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
                "serviceName=" + serviceName +
                ", areaUse='" + areaUse + '\'' +
                ", price='" + price + '\'' +
                ", maxHuman=" + maxHuman +
                ", styleRent=" + styleRent +
                ",idService=" + idService +
                ", floor='" + floor + '\'' +
                ", roomStandard='" + roomStandard+ '\'' +
                '}';
    }
    public String getInfoHouse() {
        return serviceName + "," + areaUse + "," + price + "," + maxHuman + "," +
                styleRent + "," + idService + "," + floor + "," + roomStandard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return this.idService.equals(house.idService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floor, roomStandard);
    }
}

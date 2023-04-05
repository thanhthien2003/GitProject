package case_study.models.facility;

public class Villa extends Facility {
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
                "areaPool=" + areaPool +
                ", floor=" + floor +
                ", roomStandard='" + roomStandard + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", areaUse=" + areaUse +
                ", price=" + price +
                ", maxHuman=" + maxHuman +
                ", styleRent='" + styleRent + '\'' +
                ", idService='" + idService + '\'' +
                '}';
    }

    public String getInforVilla(){
        return serviceName +"," + areaUse +"," + price +"," + maxHuman +"," + styleRent+"," + idService+"," + areaPool+
                "," + floor+"," + roomStandard;
    }
}

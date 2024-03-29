package case_study.models.facility;

public class Room extends Facility {
    private String freeService;
    public Room() {
    }

    public Room(String serviceName, int areaUse, float price, int maxHuman, String styleRent, String idService, String freeService) {
        super(serviceName, areaUse, price, maxHuman, styleRent, idService);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", areaUse=" + areaUse +
                ", price=" + price +
                ", maxHuman=" + maxHuman +
                ", styleRent='" + styleRent + '\'' +
                '}';
    }
    public String getInforRoom(){
        return serviceName + "," + areaUse + "," + price + "," + maxHuman + "," + styleRent + "," + idService + "," + freeService;
    }
}

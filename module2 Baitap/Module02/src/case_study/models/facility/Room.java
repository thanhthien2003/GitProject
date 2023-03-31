package case_study.models.facility;

import case_study.models.facility.ClassFacility;

public class Room  extends ClassFacility {
    private String freeService;
    public Room() {
    }

    public Room(String serviceName, int areaUse, float price, int maxHuman, String styleRent,String freeService) {
        super(serviceName, areaUse, price, maxHuman, styleRent);
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
}

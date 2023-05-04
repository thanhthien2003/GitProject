package case_study_again.models.facilitys;

import java.util.Objects;

public class Room extends Facility{
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
                "serviceName='" + serviceName + '\'' +
                ", areaUse='" + areaUse + '\'' +
                ", price=" + price +
                ", maxHuman=" + maxHuman +
                ", idService=" + idService +
                ", freeService='" + freeService + '\'' +
                '}';
    }
    public String getInforRoom(){
        return serviceName + "," + areaUse + "," + price + "," + maxHuman + "," + styleRent + "," + idService + "," + freeService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return this.getIdService().equals(room.getIdService());
    }

    @Override
    public int hashCode() {
        return Objects.hash(freeService);
    }
}

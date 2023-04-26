package case_study_again.models.facilitys;

public abstract class Facility {
    protected String  serviceName;
    protected int areaUse;
    protected float price;
    protected int maxHuman;
    protected String styleRent;
    protected String idService;

    public Facility() {
    }

    public Facility(String serviceName, int areaUse, float price, int maxHuman, String styleRent,String idService) {
        this.serviceName = serviceName;
        this.areaUse = areaUse;
        this.price = price;
        this.maxHuman = maxHuman;
        this.styleRent = styleRent;
        this.idService = idService;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(int areaUse) {
        this.areaUse = areaUse;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getMaxHuman() {
        return maxHuman;
    }

    public void setMaxHuman(int maxHuman) {
        this.maxHuman = maxHuman;
    }

    public String getStyleRent() {
        return styleRent;
    }

    public void setStyleRent(String styleRent) {
        this.styleRent = styleRent;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", areaUse=" + areaUse +
                ", price=" + price +
                ", maxHuman=" + maxHuman +
                ", styleRent='" + styleRent + '\'' +
                ", idService='" + idService + '\'' +
                '}';
    }
}

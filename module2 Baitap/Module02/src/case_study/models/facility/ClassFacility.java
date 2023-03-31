package case_study.models.facility;

public abstract class ClassFacility {
    protected String  serviceName;
    protected int areaUse;
    protected float price;
    protected int maxHuman;
    protected String styleRent;

    public ClassFacility() {
    }

    public ClassFacility(String serviceName, int areaUse, float price, int maxHuman, String styleRent) {
        this.serviceName = serviceName;
        this.areaUse = areaUse;
        this.price = price;
        this.maxHuman = maxHuman;
        this.styleRent = styleRent;
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
        return "ClassFacility{" +
                "serviceName='" + serviceName + '\'' +
                ", areaUse=" + areaUse +
                ", price=" + price +
                ", maxHuman=" + maxHuman +
                ", styleRent='" + styleRent + '\'' +
                '}';
    }
}

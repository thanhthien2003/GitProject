package mvc.model;

public class Fruit {
    private String nameFruit;
    private String styleFruit;
    private  String productionDate;
    private String endDate;
    private String origin;
    private long price;

    public Fruit() {
    }

    public Fruit(String nameFruit, String styleFruit, String productionDate, String endDate, String origin, long price) {
        this.nameFruit = nameFruit;
        this.styleFruit = styleFruit;
        this.productionDate = productionDate;
        this.endDate = endDate;
        this.origin = origin;
        this.price = price;
    }

    public String getNameFruit() {
        return nameFruit;
    }

    public void setNameFruit(String nameFruit) {
        this.nameFruit = nameFruit;
    }

    public String getStyleFruit() {
        return styleFruit;
    }

    public void setStyleFruit(String styleFruit) {
        this.styleFruit = styleFruit;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "nameFruit='" + nameFruit + '\'' +
                ", styleFruit='" + styleFruit + '\'' +
                ", productionDate='" + productionDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", origin='" + origin + '\'' +
                ", price=" + price +
                '}';
    }
    public String getInforCSV(){
        return nameFruit + " , " + styleFruit + " , " + productionDate + " , " + endDate + " , " + origin + " , " + price;
    }
}

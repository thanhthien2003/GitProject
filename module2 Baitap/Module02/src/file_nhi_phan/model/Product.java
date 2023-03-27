package file_nhi_phan.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private float price;
    private String placeProduct;
    private String description;

    public Product() {
    }

    public Product(int id, String name, float price, String placeProduct, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.placeProduct = placeProduct;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPlaceProduct() {
        return placeProduct;
    }

    public void setPlaceProduct(String placeProduct) {
        this.placeProduct = placeProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", placeProduct='" + placeProduct + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getInfo() {
        return this.id + "," + this.name + "," + this.price + "," + this.placeProduct + "," + this.description;
    }
}

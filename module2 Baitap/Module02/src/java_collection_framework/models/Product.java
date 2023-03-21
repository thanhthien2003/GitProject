package java_collection_framework.models;

import java.util.Comparator;

public class Product implements Comparator<Product> {
    private int id;
    private String nameProduct;
    private int price;

    public Product() {
    }

    public Product(int id, String nameProduct, int price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product : " +
                " id : " + this.getId() +
                ", nameProduct :'" + this.getNameProduct() + '\'' +
                ", price :" + this.getPrice();
    }
    @Override
    public int compare(Product o1, Product o2) {
        return o1.price-(o2.price);
    }

    @Override
    public Comparator<Product> reversed() {
        return Comparator.super.reversed();
    }
}

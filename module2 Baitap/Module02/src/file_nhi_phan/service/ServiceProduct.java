package file_nhi_phan.service;

import file_nhi_phan.model.Product;
import file_nhi_phan.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ServiceProduct implements IServiceProduct {
    private ProductRepository productRepository = new ProductRepository();
    static Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        List<Product> productList = productRepository.getAllproduct();
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    @Override
    public void add() {
        System.out.println("nhap ID");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhap ten san pham");
        String name = sc.nextLine();
        System.out.println("nhap gia san pham");
        float price = Float.parseFloat(sc.nextLine());
        System.out.println("nhap hang san xuat");
        String placeProduct = sc.nextLine();
        System.out.println("nhap mo ta san pham");
        String description = sc.nextLine();
        Product product = new Product(id, name, price, placeProduct, description);
        productRepository.addProduct(product);
    }

    @Override
    public void find() {
        System.out.println("Nhập tên muốn tìm vào ");
        String name = sc.nextLine();
        productRepository.findProduct(name.trim());
    }
}

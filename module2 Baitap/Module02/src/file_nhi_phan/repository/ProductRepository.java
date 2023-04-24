package file_nhi_phan.repository;

import file_nhi_phan.model.Product;
import file_nhi_phan.util.ReadAndWrite;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private final String PATH_FILE = "src\\file_nhi_phan\\data\\text.txt";

    @Override
    public List<Product> getAllproduct() {
        List<Product> productList = ReadAndWrite.readFile(PATH_FILE);
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        List<Product> productList = ReadAndWrite.readFile(PATH_FILE);
        productList.add(product);
        ReadAndWrite.writeFile(PATH_FILE, productList);
    }

    @Override
    public void findProduct(String name) {
        List<Product> productList = ReadAndWrite.readFile(PATH_FILE);
        boolean flag = true;
        for (Product p : productList) {
            if (name.toLowerCase().equals(p.getName().toLowerCase())) {
                System.out.println(p);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Not found");
        }
    }

    @Override
    public void edit(Product product) {
        List<Product> productList = ReadAndWrite.readFile(PATH_FILE);
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == product.getId()) {
                productList.set(i, product);
                ReadAndWrite.writeFile(PATH_FILE, productList);
            }
        }
    }
}

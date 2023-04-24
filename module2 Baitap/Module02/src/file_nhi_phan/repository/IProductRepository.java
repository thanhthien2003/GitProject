package file_nhi_phan.repository;

import file_nhi_phan.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAllproduct();
    void addProduct(Product product);
    void findProduct(String name);
    void edit(Product product);
}

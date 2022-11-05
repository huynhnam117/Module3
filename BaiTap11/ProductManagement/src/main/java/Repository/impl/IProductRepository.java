package Repository.impl;

import model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> finAll();
    void add(Product product);
    void delete(int id);
    Product findById(int id);
}

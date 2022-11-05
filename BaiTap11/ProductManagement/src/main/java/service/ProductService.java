package service;

import Repository.ProductRepository;
import Repository.impl.IProductRepository;
import model.Product;
import service.impl.IProductService;
import java.util.List;

public class ProductService implements IProductService {
private IProductRepository productRepository = new ProductRepository();
    @Override
    public List<Product> finAll() {
        return productRepository.finAll();
    }

    @Override
    public void add(Product product) {
         productRepository.add(product);
    }

    @Override
    public void delete(int id) {
        productRepository.delete(id);

    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }


}

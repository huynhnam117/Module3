package Repository;

import Repository.impl.IProductRepository;
import model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> listProduct = new ArrayList<>();
    static {
        listProduct.add(new Product(1, "Bột Giặt", 30.000, "Túi lớn", "Omo"));
        listProduct.add(new Product(2, "Nước Mắm", 15.000, "Đóng chai", "Nam Ngư"));
        listProduct.add(new Product(3, "Đường", 12.000, "bịch vừa", "Null"));
        listProduct.add(new Product(4, "Nước Rửa Chén", 24.000, "Bình nhỏ", "Omo"));
    }
    @Override
    public List<Product> finAll() {
        return listProduct;
    }

    @Override
    public void add(Product product) {
        listProduct.add(product);
    }

    @Override
    public void delete(int id) {
        listProduct.remove(id);
    }

    @Override
    public Product findById(int id) {
        return listProduct.get(id);
    }
}

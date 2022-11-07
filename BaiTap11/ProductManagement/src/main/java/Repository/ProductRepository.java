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
    public void addProduct(Product product) {
        listProduct.add(product);
    }

    @Override
    public void editProduct(int id, String value, int parameter) {
        switch (parameter) {
            case 1:
                listProduct.get(id - 1).setName(value);
                break;
            case 2:
                double newPrice = Double.parseDouble(value);
                listProduct.get(id - 1).setPrice(newPrice);
                break;
            case 3:
                listProduct.get(id - 1).setDescribe(value);
                break;
            case 4:
                listProduct.get(id - 1).setProducer(value);
                break;
        }
    }

    @Override
    public void deleteProduct(int id) {
        listProduct.remove(id - 1);
    }

    @Override
    public void viewProduct(int id) {

    }

    @Override
    public List<Product> getProducts() {
        return listProduct;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productsFound = new ArrayList<>();

        for (Product x : listProduct) {
            if (x.getName().contains(name)) {
                productsFound.add(x);
            }
        }
        return productsFound;
    }
    }


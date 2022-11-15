package repository;

import model.Customer;

import java.util.List;
import java.util.Map;

public interface ICustomerRepository {
    List<Customer> findAll();

    boolean create(Customer customer);

    Customer findById(int idFind);

    boolean edit(Customer customer);

    boolean delete(int id);

    List<Customer> search(String nameSearch);
    Map<Integer, String> findAllCustomerType();

}

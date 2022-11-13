package repository;

import model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();

    boolean create(Customer customer);

    Customer findById(int idFind);

    boolean edit(Customer customer);

    boolean delete(int id);

    List<Customer> search(String nameSearch);
}

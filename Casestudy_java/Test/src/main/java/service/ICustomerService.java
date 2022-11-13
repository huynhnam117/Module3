package service;

import model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    boolean create(Customer customer) throws SQLException;

    Customer findById(int customerId);

    boolean edit(Customer customer);

    boolean delete(int customerId);



    List<Customer> search(String name);
}


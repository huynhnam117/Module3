package service;

import model.Customer;
import model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();

    boolean create(Employee employee) throws SQLException;

    Employee findById(int employeeId);

    boolean edit(Employee employee);

    boolean delete(int employeeId);

    List<Employee> search(String nameSearch);
}

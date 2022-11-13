package repository.impl;

import model.Customer;
import model.Employee;
import repository.BaseRepository;
import repository.IEmployeeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String FIND_ALL = "SELECT * FROM castudy1.employee;";
    private static final String INSERT = "insert into employee(name, date_of_birth, id_card,salary, phone_number, email, address, position_id, education_degree_id, division_id,username) "+" value(?,?,?,?,?,?,?,?,?,?,?) ";
    private static final String FIND_BY_ID = "select * from employee where id = ?;";
    private static final String UPDATE = "update employee set name = ?, date_of_birth = ?, id_card = ?,salary = ?, phone_number = ?,email = ?, address = ?, position_id = ?, education_degree_id = ? , division_id = ?, username = ?,where id = ?;";
    private static final String DELETE = "DELETE FROM employee WHERE id = ?;";
    private static final String SEARCH = "select * from customer where is_delete = 0 and name like ? and " + "address like ? and phone_number like ?;";
    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int employeeId = resultSet.getInt("id");
                String employeeName = resultSet.getString("name");
                String employeeDate_of_birth = resultSet.getString("date_of_birth");
                String employeeId_card = resultSet.getString("id_card");
                Double employeeSalary = resultSet.getDouble("salary");
                int employeePhone = resultSet.getInt("phone_number");
                String employeeEmail = resultSet.getString("email");
                String employeeAddress = resultSet.getString("address");
                int employeePosition_id = resultSet.getInt("position_id");
                int employeeEducation_degree_id = resultSet.getInt("education_degree_id");
                int employeeDivision_id = resultSet.getInt("division_id");
                String employeeUsername = resultSet.getString("username");
                Employee employee = new Employee(employeeId, employeeName, employeeDate_of_birth, employeeId_card,employeeSalary, employeePhone,employeeEmail,
                        employeeAddress, employeePosition_id, employeeEducation_degree_id, employeeDivision_id, employeeUsername);
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public boolean create(Employee employee) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT);
            preparedStatement.setString(1, employee.getEmployeeName());
            preparedStatement.setString(2, employee.getEmployeeDate_of_birth());
            preparedStatement.setString(3, employee.getEmployeeId_card());
            preparedStatement.setDouble(4, employee.getEmployeeSalary());
            preparedStatement.setInt(5, employee.getEmployeePhone());
            preparedStatement.setString(6, employee.getEmployeeEmail());
            preparedStatement.setString(7, employee.getEmployeeAddress());
            preparedStatement.setInt(8, employee.getEmployeePosition_id());
            preparedStatement.setInt(9, employee.getEmployeeEducation_degree_id());
            preparedStatement.setInt(10, employee.getEmployeeDivision_id());
            preparedStatement.setString(11, employee.getEmployeeUsername());

            int num = preparedStatement.executeUpdate();
            return (num == 1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Employee findById(int idFind) {
        Customer customer = null;
        Connection connection = BaseRepository.getConnectDB();
        Employee employee = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID);
            preparedStatement.setInt(1, idFind);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String employeeName = resultSet.getString("name");
                String employeeDate_of_birth = resultSet.getString("date_of_birth");
                String employeeId_card = resultSet.getString("id_card");
                Double employeeSalary = resultSet.getDouble("salary");
                int employeePhone = resultSet.getInt("phone_number");
                String employeeEmail = resultSet.getString("email");
                String employeeAddress = resultSet.getString("address");
                int employeePosition_id = resultSet.getInt("position_id");
                int employeeEducation_degree_id = resultSet.getInt("education_degree_id");
                int employeeDivision_id = resultSet.getInt("division_id");
                String employeeUsername = resultSet.getString("username");
                employee = new Employee(idFind,employeeName, employeeDate_of_birth, employeeId_card, employeeSalary, employeePhone, employeeEmail,
                        employeeAddress, employeePosition_id, employeeEducation_degree_id, employeeDivision_id, employeeUsername);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public boolean edit(Employee employee) {
        boolean rowUpdated = false;
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setString(1, employee.getEmployeeName());
            preparedStatement.setString(2, employee.getEmployeeDate_of_birth());
            preparedStatement.setString(3, employee.getEmployeeId_card());
            preparedStatement.setDouble(4, employee.getEmployeeSalary());
            preparedStatement.setInt(5, employee.getEmployeePhone());
            preparedStatement.setString(6, employee.getEmployeeEmail());
            preparedStatement.setString(7, employee.getEmployeeAddress());
            preparedStatement.setInt(8, employee.getEmployeePosition_id());
            preparedStatement.setInt(9, employee.getEmployeeEducation_degree_id());
            preparedStatement.setInt(10, employee.getEmployeeDivision_id());
            preparedStatement.setString(11, employee.getEmployeeUsername());
            rowUpdated = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdated;
    }

    @Override
    public boolean delete(int id) {
        boolean rowDelete = false;
        try {Connection connection = BaseRepository.getConnectDB();
            PreparedStatement statement = connection.prepareStatement(DELETE);
            statement.setInt(1, id);
            rowDelete = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDelete;
    }


    @Override
    public List<Employee> search(String nameSearch) {
        List<Employee> employeeList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH);
            preparedStatement.setString(1, "%" + nameSearch + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int employeeId = resultSet.getInt("id");
                String employeeName = resultSet.getString("name");
                String employeeDate_of_birth = resultSet.getString("date_of_birth");
                String employeeId_card = resultSet.getString("id_card");
                Double employeeSalary = resultSet.getDouble("salary");
                int employeePhone = resultSet.getInt("phone_number");
                String employeeEmail = resultSet.getString("email");
                String employeeAddress = resultSet.getString("address");
                int employeePosition_id = resultSet.getInt("position_id");
                int employeeEducation_degree_id = resultSet.getInt("education_degree_id");
                int employeeDivision_id = resultSet.getInt("division_id");
                String employeeUsername = resultSet.getString("username");
                Employee employee = new Employee(employeeId, employeeName, employeeDate_of_birth, employeeId_card,employeeSalary, employeePhone,employeeEmail,
                        employeeAddress, employeePosition_id, employeeEducation_degree_id, employeeDivision_id, employeeUsername);
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
        }

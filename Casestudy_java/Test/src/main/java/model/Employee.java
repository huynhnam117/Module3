package model;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String employeeDate_of_birth;
    private String employeeId_card;
    private double employeeSalary;
    private int employeePhone;
    private String employeeEmail;
    private String employeeAddress;
    private int employeePosition_id;
    private int employeeEducation_degree_id;
    private int employeeDivision_id;
    private String employeeUsername;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, String employeeDate_of_birth, String employeeId_card, double employeeSalary, int employeePhone, String employeeEmail, String employeeAddress, int employeePosition_id, int employeeEducation_degree_id, int employeeDivision_id, String employeeUsername) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDate_of_birth = employeeDate_of_birth;
        this.employeeId_card = employeeId_card;
        this.employeeSalary = employeeSalary;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
        this.employeePosition_id = employeePosition_id;
        this.employeeEducation_degree_id = employeeEducation_degree_id;
        this.employeeDivision_id = employeeDivision_id;
        this.employeeUsername = employeeUsername;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDate_of_birth() {
        return employeeDate_of_birth;
    }

    public void setEmployeeDate_of_birth(String employeeDate_of_birth) {
        this.employeeDate_of_birth = employeeDate_of_birth;
    }

    public String getEmployeeId_card() {
        return employeeId_card;
    }

    public void setEmployeeId_card(String employeeId_card) {
        this.employeeId_card = employeeId_card;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(int employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public int getEmployeePosition_id() {
        return employeePosition_id;
    }

    public void setEmployeePosition_id(int employeePosition_id) {
        this.employeePosition_id = employeePosition_id;
    }

    public int getEmployeeEducation_degree_id() {
        return employeeEducation_degree_id;
    }

    public void setEmployeeEducation_degree_id(int employeeEducation_degree_id) {
        this.employeeEducation_degree_id = employeeEducation_degree_id;
    }

    public int getEmployeeDivision_id() {
        return employeeDivision_id;
    }

    public void setEmployeeDivision_id(int employeeDivision_id) {
        this.employeeDivision_id = employeeDivision_id;
    }

    public String getEmployeeUsername() {
        return employeeUsername;
    }

    public void setEmployeeUsername(String employeeUsername) {
        this.employeeUsername = employeeUsername;
    }
}
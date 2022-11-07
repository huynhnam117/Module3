package model;

public class Employee {
private int Employeeid;
private String Employeename;
private String Employeedate_of_birth;
private String Employeeid_card;
private double Employeesalary;
private int Employeephone;
private String Employeeemail;
private String Employeeaddress;
private int Employeeposition_id;
private int Employeeeducation_degree_id;
private int Employeedivision_id;
private String Employeeusername;

    public Employee() {
    }

    public Employee(int employeeid, String employeename, String employeedate_of_birth, String employeeid_card, double employeesalary, int employeephone, String employeeemail, String employeeaddress, int employeeposition_id, int employeeeducation_degree_id, int employeedivision_id, String employeeusername) {
        Employeeid = employeeid;
        Employeename = employeename;
        Employeedate_of_birth = employeedate_of_birth;
        Employeeid_card = employeeid_card;
        Employeesalary = employeesalary;
        Employeephone = employeephone;
        Employeeemail = employeeemail;
        Employeeaddress = employeeaddress;
        Employeeposition_id = employeeposition_id;
        Employeeeducation_degree_id = employeeeducation_degree_id;
        Employeedivision_id = employeedivision_id;
        Employeeusername = employeeusername;
    }

    public int getEmployeeid() {
        return Employeeid;
    }

    public void setEmployeeid(int employeeid) {
        Employeeid = employeeid;
    }

    public String getEmployeename() {
        return Employeename;
    }

    public void setEmployeename(String employeename) {
        Employeename = employeename;
    }

    public String getEmployeedate_of_birth() {
        return Employeedate_of_birth;
    }

    public void setEmployeedate_of_birth(String employeedate_of_birth) {
        Employeedate_of_birth = employeedate_of_birth;
    }

    public String getEmployeeid_card() {
        return Employeeid_card;
    }

    public void setEmployeeid_card(String employeeid_card) {
        Employeeid_card = employeeid_card;
    }

    public double getEmployeesalary() {
        return Employeesalary;
    }

    public void setEmployeesalary(double employeesalary) {
        Employeesalary = employeesalary;
    }

    public int getEmployeephone() {
        return Employeephone;
    }

    public void setEmployeephone(int employeephone) {
        Employeephone = employeephone;
    }

    public String getEmployeeemail() {
        return Employeeemail;
    }

    public void setEmployeeemail(String employeeemail) {
        Employeeemail = employeeemail;
    }

    public String getEmployeeaddress() {
        return Employeeaddress;
    }

    public void setEmployeeaddress(String employeeaddress) {
        Employeeaddress = employeeaddress;
    }

    public int getEmployeeposition_id() {
        return Employeeposition_id;
    }

    public void setEmployeeposition_id(int employeeposition_id) {
        Employeeposition_id = employeeposition_id;
    }

    public int getEmployeeeducation_degree_id() {
        return Employeeeducation_degree_id;
    }

    public void setEmployeeeducation_degree_id(int employeeeducation_degree_id) {
        Employeeeducation_degree_id = employeeeducation_degree_id;
    }

    public int getEmployeedivision_id() {
        return Employeedivision_id;
    }

    public void setEmployeedivision_id(int employeedivision_id) {
        Employeedivision_id = employeedivision_id;
    }

    public String getEmployeeusername() {
        return Employeeusername;
    }

    public void setEmployeeusername(String employeeusername) {
        Employeeusername = employeeusername;
    }
}

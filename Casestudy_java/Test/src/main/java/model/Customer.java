package model;

public class Customer {
    private int Customerid;
    private String CustomerName;
    private String CustomerBirthDay;
    private int CustomerGender;
    private String CustomerIdCard;
    private String CustomerPhone;
    private String CustomerEmail;
    private String CustomerAddress;
    private int CustomerTypeId;

    public Customer() {
    }

    public Customer(int customerid, String customerName, String customerBirthDay, int customerGender, String customerIdCard, String customerPhone, String customerEmail, String customerAddress, int customerTypeId) {
        Customerid = customerid;
        CustomerName = customerName;
        CustomerBirthDay = customerBirthDay;
        CustomerGender = customerGender;
        CustomerIdCard = customerIdCard;
        CustomerPhone = customerPhone;
        CustomerEmail = customerEmail;
        CustomerAddress = customerAddress;
        CustomerTypeId = customerTypeId;
    }

    public int getCustomerid() {
        return Customerid;
    }

    public void setCustomerid(int customerid) {
        Customerid = customerid;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerBirthDay() {
        return CustomerBirthDay;
    }

    public void setCustomerBirthDay(String customerBirthDay) {
        CustomerBirthDay = customerBirthDay;
    }

    public int getCustomerGender() {
        return CustomerGender;
    }

    public void setCustomerGender(int customerGender) {
        CustomerGender = customerGender;
    }

    public String getCustomerIdCard() {
        return CustomerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        CustomerIdCard = customerIdCard;
    }

    public String getCustomerPhone() {
        return CustomerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        CustomerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        CustomerAddress = customerAddress;
    }

    public int getCustomerTypeId() {
        return CustomerTypeId;
    }

    public void setCustomerTypeId(int customerTypeId) {
        CustomerTypeId = customerTypeId;
    }
}

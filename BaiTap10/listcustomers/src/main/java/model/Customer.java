package model;

public class Customer {
    private int id;
    private String name;
    private String birthDay;
    private String address;
    private String email;
    private String image;

    public Customer() {
    }

    public Customer(int id, String name, String birthDay, String address, String email, String image) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.address = address;
        this.email = email;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        image = image;
    }
}

package model;

public class Customer {
    private int id;
    private String name;
    private String BirthDay;
    private String address;
    private String Email;
    private String Image;

    public Customer() {
    }

    public Customer(int id, String name, String birthDay, String address, String Email, String Image) {
        this.id = id;
        this.name = name;
        this.BirthDay = birthDay;
        this.address = address;
        this.Email = Email;
        this.Image = Image;
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
        return BirthDay;
    }

    public void setBirthDay(String birthDay) {
        BirthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}

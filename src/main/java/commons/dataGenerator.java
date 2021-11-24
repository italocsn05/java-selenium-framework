package commons;

import com.github.javafaker.Faker;

public class dataGenerator {
    private Faker faker;
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String password;
    private String confirmPassword;
    private String address;
    private String country;
    private String state;
    private String city;

    public dataGenerator() {
        this.faker = new Faker();
        this.setFirstName(faker.name().firstName());
        this.setLastName(faker.name().lastName());
        this.setEmail(faker.internet().emailAddress());
        this.setTelephone(faker.phoneNumber().cellPhone());
        this.setPassword(faker.internet().password());
        this.setConfirmPassword(this.getPassword());
        this.setAddress(faker.address().fullAddress());
        this.setCountry(faker.address().country());
        this.setState(faker.address().state());
        this.setCity(faker.address().city());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

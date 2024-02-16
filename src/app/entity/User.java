package app.entity;

public class User {

    private String name;
    private String surname;
    private int registrationNumber;
    private double value;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public User(int registrationNumber, double value) {
        this.registrationNumber = registrationNumber;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public double getValue() {
        return value;
    }
}

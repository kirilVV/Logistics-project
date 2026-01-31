package model;

import exceptions.InvalidInputInfo;

public class CustomerContact {
    private final String name;
    private final String phone;
    private final String email;

    public CustomerContact(String name, String phone, String email) {
        if (name == null || name.isBlank()) {
            throw new InvalidInputInfo("Customer name cannot be null or empty.");
        }
        if (phone == null || phone.isBlank()) {
            throw new InvalidInputInfo("Phone number cannot be null or empty.");
        }
        if (email == null || email.isBlank() || !email.contains("@")) {
            throw new InvalidInputInfo("Invalid email address.");
        }

        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Phone: " + phone +
                ", Email: " + email;
    }
    
}

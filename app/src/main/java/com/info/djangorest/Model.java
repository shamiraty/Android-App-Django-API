package com.info.djangorest;

public class Model {
    String FirstName,LastName,PhoneNumber,Email;

    public Model(String firstName, String lastName, String phoneNumber, String email) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.PhoneNumber = phoneNumber;
        this.Email = email;
    }
}

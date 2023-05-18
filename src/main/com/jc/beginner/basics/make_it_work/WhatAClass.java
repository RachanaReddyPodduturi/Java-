package main.com.jc.beginner.basics.make_it_work;

public class WhatAClass {

    public int id;
    public String firstName;
    public String lastName;
    public String phone;
    public String email;

    public WhatAClass(int id, String fName, String lName, String phone, String email) {
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
        this.phone = phone;
        this.email = email;
    }

    public String print() {
        return id + " " + firstName + " "+ lastName + " "+ phone + " "+ email;
    }

}

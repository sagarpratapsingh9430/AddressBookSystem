package com.bridgelabz.addressbook;

public class Contact {
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String mobileNumber;
    private String email;

    public Contact(String name, String address, String city, String state, String zip, String mobileNumber, String email) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void getContactDetails(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip Code: " + zip);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Email: " + email);
    }
}

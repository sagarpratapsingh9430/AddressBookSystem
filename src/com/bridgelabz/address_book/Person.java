package com.bridgelabz.address_book;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    ArrayList<Contact> contactList = new ArrayList<>();

    Contact obj = new Contact();
    void addContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        obj.setFirstName(sc.next());

        System.out.println("Enter the last name: ");
        obj.setLastName(sc.next());

        System.out.println("Enter address: ");
        obj.setAddress(sc.next());

        System.out.println("Enter city name: ");
        obj.setCity(sc.next());

        System.out.println("Enter state name: ");
        obj.setState(sc.next());

        System.out.println("Enter your postal code: ");
        obj.setZip(sc.nextInt());

        System.out.println("Enter contact number: ");
        obj.setPhoneNumber(sc.nextLong());

        System.out.println("Enter your email id: ");
        obj.setEmail(sc.next());

        contactList.add(obj);
        System.out.println(contactList);

    }

}

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

        System.out.println("Choose a option to edit: ");
        System.out.println("1: Edit name: ");
        System.out.println("2: Edit address: ");
        System.out.println("3: Edit city name: ");
        System.out.println("4: Edit state name: ");
        System.out.println("5: Edit your postal code: ");
        System.out.println("6: Edit your contact number: ");
        System.out.println("7: Edit your email: " );

        int option = sc.nextInt();
        switch (option){
            case 1:
                System.out.println("first name: ");
                obj.setFirstName(sc.next());
                System.out.println("last name:");
                obj.setLastName(sc.next());
                break;
            case 2:
                System.out.println("Enter address: ");
                obj.setAddress(sc.next());
                break;
            case 3:
                System.out.println("Enter city name: ");
                obj.setCity(sc.next());
                break;
            case 4:
                System.out.println("Enter state name: ");
                obj.setState(sc.next());
                break;
            case 5:
                System.out.println("Enter postal cade: ");
                obj.setPhoneNumber(sc.nextLong());
                break;
            case 6:
                System.out.println("Enter contact number: ");
                obj.setPhoneNumber(sc.nextLong());
                break;
            case 7:
                System.out.println("Enter your email id: ");
                obj.setEmail(sc.next());
            default:
                System.out.println("Choose correct option: ");
        }

        contactList.add(obj);
        System.out.println(contactList);

    }

}

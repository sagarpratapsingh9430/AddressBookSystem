package com.bridgelabz.address_book;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program: ");
        Person person = new Person();
        Scanner sc = new Scanner(System.in);

        // Adding contacts
        Contact contact1 = new Contact("Sagar","Singh","Annapurna","Indore","M.P.",452009,991234683,"a.xyz@gmail.com");
        Contact contact2 = new Contact("Raj","Singh","Annapurna","Indore","M.P.",452009,991234683,"a.xyz@gmail.com");
        person.addContact(contact1);
        person.addContact(contact2);

        // Displaying contacts
        person.displayContacts();
        
        System.out.println("Enter the name that you want to delete: ");
        String name = sc.nextLine();

        // Deleting a contact
        person.deleteContact(name);

        // Displaying contacts after deletion
        person.displayContacts();
    }
}

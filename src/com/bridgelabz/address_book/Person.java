package com.bridgelabz.address_book;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    private ArrayList<Contact> contactsList = new ArrayList<>();

    public void addContact(Contact contact)
    {
        contactsList.add(contact);
    }
    public void deleteContact(String name) {
        for (Contact contact : contactsList) {
            if (contact.getFirstName().equals(name)) {
                contactsList.remove(contact);

                System.out.println("Contact deleted: " + name);
                return;
            }
        }
        System.out.println("Contact not found: " + name);
    }

    public void displayContacts() {
        if (contactsList.isEmpty()) {
            System.out.println("Address book is empty.");
        } else {
            System.out.println("Address book contacts:");
            for (Contact contact : contactsList) {
                System.out.println("First Name: " + contact.getFirstName());
                System.out.println("Last Name: " + contact.getLastName());
                System.out.println("Address: " + contact.getAddress());
                System.out.println("City Name: " + contact.getCity());
                System.out.println("State Name: " + contact.getState());
                System.out.println("Zip code: " + contact.getZip());
                System.out.println("Phone Number: " + contact.getPhoneNumber());
                System.out.println("Email: " + contact.getEmail());
                System.out.println("-----------------------------");
            }
        }
    }
}

package com.bridgelabz.addressbook;

import java.util.ArrayList;

public class Collection {
    ArrayList<Contact> contacts = new ArrayList<>();

    void addContact(Contact contact){
        contacts.add(contact);
    }

    public void delete(String newName){
        for (Contact contact : contacts) {
            if (contact.getName().equals(newName)) {
                contacts.remove(contact);
                System.out.println("Contact deleted: " + newName);
                return;
            }
        }
        System.out.println("Contact not found: " + newName);
    }

    public void edit(String newName, Contact updateContact){

        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getName().equals(newName)) {
                contacts.set(i, updateContact);
                System.out.println("Contact updated successfully.");
                return;
            }
        }
        System.out.println("Contact not found: " + newName);
    }

    void display(){
        if (contacts.isEmpty()){
            System.out.println("Address book is empty: ");
        }else {
            for (Contact contact : contacts) {
                contact.getContactDetails();
                System.out.println("-------------------");
            }
        }
    }
}

package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Collection collection = new Collection();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Address Book Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Delete Contact");
            System.out.println("4. Edit Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter City Name: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter State Name: ");
                    String state = scanner.nextLine();
                    System.out.print("Enter Postal Code: ");
                    String zip = scanner.nextLine();
                    System.out.print("Enter Mobile Number: ");
                    String mobileNumber = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    Contact contact = new Contact(name,address,city,state,zip,mobileNumber,email);
                    collection.addContact(contact);
                    break;
                case 2:
                    collection.display();
                    break;
                case 3:
                    System.out.print("Enter Name to delete contact: ");
                    String deleteName = scanner.nextLine();
                    collection.delete(deleteName);
                    break;
                case 4:
                    System.out.println("Enter the name that you want to edit: ");
                    String name1 = scanner.nextLine();
                    System.out.print("Enter new name: ");
                    String editName = scanner.nextLine();
                    System.out.print("Enter new address: ");
                    String newAddress = scanner.nextLine();
                    System.out.print("Enter new city name: ");
                    String newCity = scanner.nextLine();
                    System.out.print("Enter new state name: ");
                    String newState = scanner.nextLine();
                    System.out.print("Enter new postal code: ");
                    String newPostalCode = scanner.nextLine();
                    System.out.print("Enter new mobile number: ");
                    String newMobileNumber = scanner.nextLine();
                    System.out.print("Enter new email: ");
                    String newEmail = scanner.nextLine();
                    Contact updatedContact = new Contact(editName,newAddress,newCity,newState,newPostalCode,newMobileNumber, newEmail);

                    collection.edit(name1, updatedContact);
                    break;
                case 5:
                    System.out.println("Exiting Address Book Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

            System.out.println();
        }
    }
}

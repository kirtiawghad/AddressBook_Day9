package com.bl;
import java.util.*;
public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");

        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);

        int Number;

        do {
            System.out.println(" 1. Add Contact \n 2. Display contact ");
            System.out.println("Enter the  Number: ");

            Number = sc.nextInt();

            switch (Number) {

                case 1:
                    addressBook.addContacts();
                    break;
                case 2:
                    addressBook.displayContacts();
                    break;
                default:
                    System.out.println(" Invalid Input!!! ");
                    break;

            }
        } while (Number != 2);
    }
    }


package com.bl;
import java.util.*;
public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);

        int Number;

        do {
            System.out.println(" 1. Add Contact \n 2. Display contact \n 3. Edit contact \n");
            System.out.println("Enter the  Number: ");

            Number = sc.nextInt();

            switch (Number) {

                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.displayContact();
                    break;
                case 3:
                    addressBook.editContact();
                    break;


                default:
                    System.out.println(" Invalid Input!!! ");
                    break;

            }
        } while (Number != 4);
    }
    }


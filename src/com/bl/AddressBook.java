package com.bl;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contacts> list = new ArrayList<Contacts>();
    Scanner sc = new Scanner(System.in);

   public void addContacts(){
        Contacts contacts = new Contacts();
       System.out.println("enter the first name");
       contacts.setFirstName(sc.next());
       System.out.println("enter the last name");
       contacts.setLastName(sc.next());
       System.out.println("enter the Address");
       contacts.setAddress(sc.next());
       System.out.println("enter the city");
       contacts.setCity(sc.next());
       System.out.println("enter the state");
       contacts.setState(sc.next());
       System.out.println("enter the zipcode");
       contacts.setZipCode(sc.nextDouble());
       System.out.println("enter the mobile nuuber");
       contacts.setMobileNum(sc.nextDouble());
       System.out.println("enter the email id");
       contacts.setEmailId(sc.next());

       list.add(contacts);
    }

    public  void  displayContacts(){
       for (int i = 0; i< list.size(); i++){
           Contacts contacts = list.get(i);
           System.out.println(contacts.toString());
       }
    }

}

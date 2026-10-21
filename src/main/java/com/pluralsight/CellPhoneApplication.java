package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CellPhone phone1 = new CellPhone();
        CellPhone phone2 = new CellPhone();

        System.out.print("What is the serial number? ");
        int serial = scan.nextInt();
        scan.nextLine();
        System.out.print("What model is the phone? ");
        String model = scan.nextLine();
        System.out.print("Who is the carrier? ");
        String carrier = scan.nextLine();
        System.out.print("What is the phone number? ");
        String phoneNumber = scan.nextLine();
        System.out.print("Who is the owner of the phone? ");
        String owner = scan.nextLine();

        System.out.print("WHat is the second phone's number?");
        String phoneNumber2 = scan.nextLine();
        phone2.setPhoneNumber(phoneNumber2);


        phone1.setSerialNumber(serial);
        phone1.setModel(model);
        phone1.setCarrier(carrier);
        phone1.setPhoneNumber(phoneNumber);
        phone1.setOwner(owner);

        /*
        System.out.println(phone1.serialNumber());
        System.out.println(phone1.model());
        System.out.println(phone1.carrier());
        System.out.println(phone1.phoneNumber());
        System.out.println(phone1.owner());

         */
        display(phone1);
        System.out.println();
        phone1.dial(phoneNumber2);


        scan.close();
    }

    public static void display(CellPhone phone){
        System.out.println("Serial number is: " + phone.serialNumber());
        System.out.println("The phone model is: " + phone.model());
        System.out.println("Carrier of the phone: " + phone.carrier());
        System.out.println("The phone number: " + phone.phoneNumber());
        System.out.println("The phone owener is: " + phone.owner());
    }
}

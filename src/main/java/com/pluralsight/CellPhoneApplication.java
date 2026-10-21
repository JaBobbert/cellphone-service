package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CellPhone phone1 = new CellPhone();

        System.out.print("What is the serial number? ");
        int serial = scan.nextInt();
        scan.nextLine();
        System.out.print("What model is the phone? ");
        String model = scan.nextLine();
        System.out.print("Who is the carrier? ");
        String carrier = scan.nextLine();
        System.out.print("What is the phone number? ");
        long phoneNumber = scan.nextLong();
        scan.nextLine();
        System.out.print("Who is the owner of the phone? ");
        String owner = scan.nextLine();

        phone1.setSerialNumber(serial);
        phone1.setModel(model);
        phone1.setCarrier(carrier);
        phone1.setPhoneNumber(phoneNumber);
        phone1.setOwner(owner);

        System.out.println(phone1.serialNumber());
        System.out.println(phone1.model());
        System.out.println(phone1.carrier());
        System.out.println(phone1.phoneNumber());
        System.out.println(phone1.owner());

    }
}

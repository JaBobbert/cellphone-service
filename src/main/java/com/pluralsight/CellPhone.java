package com.pluralsight;

import java.util.Scanner;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;
    private String dail;

    public CellPhone(){
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
        dail = "";
    }


    public int serialNumber() {
        return serialNumber;
    }

    public String model() {
        return model;
    }

    public String carrier() {
        return carrier;
    }

    public String phoneNumber() {
        return phoneNumber;
    }

    public String owner() {
        return owner;
    }

    public void dial(String phoneNumber){
        System.out.println("\n" + owner + "'s phone is calling " + phoneNumber);
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

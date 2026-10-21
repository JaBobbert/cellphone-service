package com.pluralsight;

public class CellPhone {
    int serialNumber;
    String model;
    String carrier;
    long phoneNumber;
    String owner;


    public int serialNumber() {
        return serialNumber;
    }

    public String model() {
        return model;
    }

    public String carrier() {
        return carrier;
    }

    public long phoneNumber() {
        return phoneNumber;
    }

    public String owner() {
        return owner;
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

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

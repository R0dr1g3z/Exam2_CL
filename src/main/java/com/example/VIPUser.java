package com.example;

public class VIPUser extends User {
    private int vipCardNumber;

    public VIPUser(String name, String lastName, String email, int vipCardNumber) {
        super(name, lastName, email);
        if (checkCard(vipCardNumber)) {
            this.vipCardNumber = vipCardNumber;
        }
        this.vipCardNumber = 0;
    }

    private boolean checkCard(int newNumber) {
        if (newNumber > 999 && newNumber % 2 == 0) {
            return true;
        }
        return false;
    }

    public void setVipCardNumber(int newCardNumber) {
        if (checkCard(newCardNumber)) {
            this.vipCardNumber = newCardNumber;
        }
    }

    public int getVipCardNumber() {
        return vipCardNumber;
    }
}

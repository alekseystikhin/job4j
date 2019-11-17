package com;

public class Account {

    private double value;
    private String requisites;

    public Account(double value, String requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    public double getValue() {
        return this.value;
    }

    public String getRequisites() {
        return this.requisites;
    }

    public boolean transfer(Account destination, double amount) {
        boolean result = false;
        if (canTransfer(amount)) {
            this.value -= amount;
            destination.value += amount;
            result = true;
        }
        return result;
    }

    public boolean canTransfer(double amount) {
        return this.getValue() >= amount;
    }
}
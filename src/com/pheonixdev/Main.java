package com.pheonixdev;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Indian National Bank");

        bank.addBranch("Poojapura");

        bank.addCustomer("Poojapura", "Rajappan", 400.00);
        bank.addCustomer("Poojapura", "Sasi", 600.00);
        bank.addCustomer("Poojapura", "Dasan", 200.00);

        bank.addBranch("Pettah");

        bank.addCustomer("Pettah", "Mani", 800.00);

        bank.addCustomerTransaction("Pettah", "Mani", 200.00);
        bank.addCustomerTransaction("Poojapura", "Sasi", 50.00);
        bank.addCustomerTransaction("Poojapura", "Dasan", 220.00);
        bank.addCustomerTransaction("Poojapura", "Sasi", 300.00);

        bank.listCustomers("Poojapura", true);

    }
}

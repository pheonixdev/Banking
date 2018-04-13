package com.pheonixdev;

import java.util.ArrayList;

/**
 * Created by SAB on 1/5/2018.
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String customerName, double initialAmount) {
        this.name = customerName;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}

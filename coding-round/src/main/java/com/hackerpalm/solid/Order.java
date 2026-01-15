package com.hackerpalm.solid;

public class Order {
    private Double amount;

    public Order(Double amount) {
        this.amount = amount;
    }

    public Double getAmount(){
        return amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "amount=" + amount +
                '}';
    }
}

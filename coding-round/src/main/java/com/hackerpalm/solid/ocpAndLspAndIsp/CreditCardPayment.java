package com.hackerpalm.solid.ocpAndLspAndIsp;

import com.hackerpalm.solid.Order;

public class CreditCardPayment implements Payment{

    Order order;
    public CreditCardPayment(Order o){
        this.order = o;
    }

    @Override
    public void doPayment(Double amount) {
        System.out.println("Order with price "+order.getAmount()+" placed and payment of "+amount+" via CreditCard");
    }
}

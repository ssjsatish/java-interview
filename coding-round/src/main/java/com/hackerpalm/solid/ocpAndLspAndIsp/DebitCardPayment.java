package com.hackerpalm.solid.ocpAndLspAndIsp;

import com.hackerpalm.solid.Order;

public class DebitCardPayment implements Payment{

    Order order;
    public DebitCardPayment(Order o){
        this.order = o;
    }
    @Override
    public void doPayment(Double amount) {
        System.out.println("Order with price "+order.getAmount()+" placed and payment of "+amount+" via DebitCard");
    }
}

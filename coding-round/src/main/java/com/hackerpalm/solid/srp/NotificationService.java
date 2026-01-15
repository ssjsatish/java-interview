package com.hackerpalm.solid.srp;

import com.hackerpalm.solid.Order;

public class NotificationService {

    Order order;
    public NotificationService(Order o){
        this.order=o;
    }

    public void sendMessage(){
        System.out.println("Message sent to customer that order placed and payment is done");
    }
}

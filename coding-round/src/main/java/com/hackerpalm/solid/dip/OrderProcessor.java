package com.hackerpalm.solid.dip;

import com.hackerpalm.solid.Order;
import com.hackerpalm.solid.ocpAndLspAndIsp.Payment;
import com.hackerpalm.solid.srp.NotificationService;
import com.hackerpalm.solid.srp.OrderRepository;

public class OrderProcessor {
    public Payment payment;
    public OrderRepository saveOrder;
    public NotificationService message;
    public Order order;

    public OrderProcessor(Payment payment, OrderRepository saveOrder, NotificationService message,Order order) {
        this.payment = payment;
        this.saveOrder = saveOrder;
        this.message = message;
        this.order = order;
    }

    public void processOrder(Order order){
        payment.doPayment(order.getAmount());
        message.sendMessage();
        saveOrder.save(order);
    }
}

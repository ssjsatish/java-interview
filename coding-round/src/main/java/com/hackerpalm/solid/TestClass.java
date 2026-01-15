package com.hackerpalm.solid;

import com.hackerpalm.solid.dip.OrderProcessor;
import com.hackerpalm.solid.ocpAndLspAndIsp.CreditCardPayment;
import com.hackerpalm.solid.ocpAndLspAndIsp.Payment;
import com.hackerpalm.solid.srp.NotificationService;
import com.hackerpalm.solid.srp.OrderRepository;

public class TestClass {



        public static void main(String[] args) {

            Order order = new Order(3500.0);
            Payment payment = new CreditCardPayment(order); /* LSP demonstration: we can replace this with DebitCardPayment*/
            OrderRepository repository = new OrderRepository();
            NotificationService notificationService = new NotificationService(order);

            OrderProcessor processor =
                    new OrderProcessor(payment, repository, notificationService,order);

            processor.processOrder(order);
        }
    }


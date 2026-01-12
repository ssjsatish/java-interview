package com.hackerpalm.concurrency.ProducerConsumer;

public class ProducerConsumerTEST {

    public static void main(String[] args) {
        ProducerConsumerImpl pC = new ProducerConsumerImpl(3);

        Thread T1 = new Thread(()->{
            try {
                for(int i=0;i<6;i++) {
                    pC.addItem(i);
                }
            }catch(Exception e) {
                System.out.println("handling exception if any");
                e.printStackTrace();
            }
        });

        Thread T2 = new Thread(()->{
            try {
                for(int i=0;i<6;i++) {
                    pC.removeItem();
                }
            } catch(Exception e) {
                System.out.println("handling exception if any");
                e.printStackTrace();
            }
        });

        T1.start();
        T2.start();
    }

}

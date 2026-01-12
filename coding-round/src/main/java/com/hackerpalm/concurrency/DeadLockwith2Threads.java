package com.hackerpalm.concurrency;

public class DeadLockwith2Threads {

    static Object lock1 = new Object();
    static Object lock2 = new Object();


    public static void main(String[] args) {


        Thread T1 = new Thread(()-> {
            System.out.println("Inside Thread : " + Thread.currentThread().getName());
            synchronized (lock1) {
                System.out.println("Lock1 acquired by : " + Thread.currentThread().getName());

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " waiting for Lock2");
                synchronized (lock2) {
                    System.out.println("Lock2 acquired by : " + Thread.currentThread().getName());
                }


            }
        });

        Thread T2 = new Thread(()-> {
            System.out.println("Inside Thread : " + Thread.currentThread().getName());
            synchronized (lock2) {
                System.out.println("Lock2 acquired by : " + Thread.currentThread().getName());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " waiting for Lock1");
                synchronized (lock1) {
                    System.out.println("Lock1 acquired by : " + Thread.currentThread().getName());
                }
            }
        });

        T1.start();
        T2.start();

    }
}

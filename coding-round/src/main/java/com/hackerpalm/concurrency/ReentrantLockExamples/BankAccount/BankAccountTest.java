package com.hackerpalm.concurrency.ReentrantLockExamples.BankAccount;

public class BankAccountTest {

    public static void main(String[] args) {
        //BankAccount withdrawThread = new BankAccount();
        //BankAccount depositThread = new BankAccount();
        BankAccount transaction = new BankAccount();
        Thread T1 = new Thread(()->{
            System.out.println("Inside withdrawThread : "+Thread.currentThread().getName());
            //withdrawThread.withdraw(300);
            transaction.withdraw(300);
            /* System.out.println("After withdrawal : "+withdrawThread.getBalance()); */
            System.out.println("After withdrawal : "+transaction.getBalance());
        });

        Thread T2 = new Thread(()->{
            System.out.println("Inside depositThread : "+Thread.currentThread().getName());
            //depositThread.deposit(200);
            transaction.deposit(200);
            /* System.out.println("After deposit : "+depositThread.getBalance()); */
            System.out.println("After deposit : "+transaction.getBalance());
        });

        T1.start();
        T2.start();
    }
}

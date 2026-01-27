package com.hackerpalm.concurrency.ReentrantLockExamples.BankAccount;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int balance = 1000;
    ReentrantLock lock = new ReentrantLock();

    void withdraw(int debit) {
        try {
            lock.lock();
            balance = balance - debit;
            System.out.println("Amount debited : "+debit);
            System.out.println("New updated balance : "+balance);

        }finally {
            lock.unlock();
        }
    }

    void deposit(int credit) {
        try {
            lock.lock();
            balance = balance + credit;
            System.out.println("Amount credited : "+credit);
            System.out.println("New updated balance : "+balance);
        }finally{
            lock.unlock();

        }

    }

    public int getBalance() {
        return balance;
    }
}

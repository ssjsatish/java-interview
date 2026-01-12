package com.hackerpalm.concurrency.ProducerConsumer;

import java.util.concurrent.ArrayBlockingQueue;

public class ProducerConsumerImpl {
    private ArrayBlockingQueue<Object> buffer;
    private int bufferSize;

    ProducerConsumerImpl(int bS){
        this.bufferSize = bS;
        buffer = new ArrayBlockingQueue<>(bS);
    }

    public synchronized void addItem(int x){

        if(buffer.size()==bufferSize){
            try {
                System.out.println("List is full, cannot produce more items");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        buffer.add(x);
        System.out.println("Produced : "+x);
        notify();
    }

    public synchronized int removeItem(){
        if(buffer.isEmpty()){
            try {
                System.out.println("List is empty, cannot consume more items");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int y = (int) buffer.poll();
        System.out.println("Cosumed : "+y);
        notify();
        return y;
    }
}

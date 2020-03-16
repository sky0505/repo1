package com.jv.basic.thread.threadcommunicate;

public class Test {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        Producter p = new Producter(bz, 1);
        Customer c = new Customer(bz, 0);
        new Thread(p,"生产线程").start();
        new Thread(c,"消费者线程").start();
    }
}

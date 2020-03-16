package com.jv.basic.thread;

public class Task implements Runnable
{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程："+Thread.currentThread().getName());
        System.out.println("当前线程回线程池了");
    }
}
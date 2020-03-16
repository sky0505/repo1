package com.jv.basic.thread;

public class Mythread extends Thread {
    public Mythread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0;i < 100;i++)
        System.out.println(this.getName()+"正在执行"+i);
    }
}

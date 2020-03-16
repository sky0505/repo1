package com.jv.basic.thread.threadcommunicate;

import java.util.ArrayList;

public class ThreadSort implements Runnable{

    public ArrayList<String> arr;
    private int count;
    private Object prev;
    private Object self;
    private String name;


    public ThreadSort(ArrayList<String> arr, int count, Object prev, Object self, String name) {
        this.arr = arr;
        this.count = count;
        this.prev = prev;
        this.self = self;
        this.name = name;
    }

    @Override
    public void run() {
        while(count>0) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.print(name);
                    arr.add(name);
                    count--;
                    self.notifyAll();
                }
                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        ArrayList<String> arr = new ArrayList<>();
        ThreadSort t1 = new ThreadSort(arr, 10, c, a, "a");
        ThreadSort t2 = new ThreadSort(arr, 10, a, b, "b");
        ThreadSort t3 = new ThreadSort(arr, 10, b, c, "c");

        new Thread(t1).start();
        Thread.sleep(10);
        new Thread(t2).start();
        Thread.sleep(10);
        new Thread(t3).start();
        Thread.sleep(10);
        System.out.println(arr);


    }
}

package com.jv.basic.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        Task task = new Task();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(task);
        executorService.submit(task);
        executorService.submit(task);
        executorService.submit(task);
        executorService.submit(task);

    }


}

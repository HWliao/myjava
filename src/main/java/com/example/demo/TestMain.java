package com.example.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestMain {

    public static final ThreadLocal<String> m = new ThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {
        final ExecutorService f1 = Executors.newFixedThreadPool(1);
        final ExecutorService f2 = Executors.newFixedThreadPool(1);

        print(1);
        f1.submit(() -> {
            try {
                print(1);

                f2.submit(() -> {
                    print(1);
                    m.set("f2");
                    print(2);
                    m.remove();
                });
                Thread.sleep(1000L);
                print(2);
                f2.submit(() -> {
                    print(3);
                    m.set("f2-1");
                    print(4);
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread.sleep(10000L);
        print(2);

        f1.shutdown();
        f2.shutdown();
    }


    public static void print(int num) {
        long id = Thread.currentThread().getId();
        String s = m.get();
        System.out.println(id + "-" + num + ":" + s);
    }
}

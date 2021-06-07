package org.example;

import java.util.concurrent.Callable;

import static java.lang.Thread.sleep;

public class MyCallable implements Callable<Integer> {
    private final int count;

    public MyCallable(int count) {
        this.count = count;
    }

    @Override
    public Integer call() throws Exception {
        int i = 0;
        try {
            while (i < count) {
                System.out.println(Thread.currentThread().getName() + ": Привет!");
                sleep(2500);
                i++;
            }
        } catch (InterruptedException e) {

        } finally {
            System.out.printf("%s завершен\n", Thread.currentThread().getName());
        }
        return i;
    }
}

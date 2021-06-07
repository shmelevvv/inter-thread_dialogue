package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        ThreadGroup threadGroup = new ThreadGroup("grou");
//        MyThread thread1 = new MyThread(threadGroup, "Поток1");
//        thread1.start();
//        MyThread thread2 = new MyThread(threadGroup, "Поток2");
//        thread2.start();
//        MyThread thread3 = new MyThread(threadGroup, "Поток3");
//        thread3.start();
//        MyThread thread4 = new MyThread(threadGroup, "Поток4");
//        thread4.start();
//
//        Thread.currentThread().sleep(15000);
//        threadGroup.interrupt();

        final ExecutorService threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        List<Future<Integer>> resultList = new ArrayList<>();
        List<MyCallable> callableList = new ArrayList<>();
        callableList.add(new MyCallable(8));
        callableList.add(new MyCallable(6));
        callableList.add(new MyCallable( 11));
        callableList.add(new MyCallable( 5));
        resultList = threadPool.invokeAll(callableList);
        for (Future<Integer> future : resultList) {
            System.out.println(future.get());
        }
        System.out.println(threadPool.invokeAny(callableList));


    }
}

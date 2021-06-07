package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup threadGroup = new ThreadGroup("grou");
        MyThread thread1 = new MyThread(threadGroup, "Поток1");
        thread1.start();
        MyThread thread2 = new MyThread(threadGroup, "Поток2");
        thread2.start();
        MyThread thread3 = new MyThread(threadGroup, "Поток3");
        thread3.start();
        MyThread thread4 = new MyThread(threadGroup, "Поток4");
        thread4.start();

        Thread.currentThread().sleep(15000);
        threadGroup.interrupt();

    }
}

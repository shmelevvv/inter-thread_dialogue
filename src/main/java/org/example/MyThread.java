package org.example;

public class MyThread extends Thread{
    public MyThread(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                System.out.println(getName() + ": Привет!");
                sleep(2500);
            }
        } catch (InterruptedException e) {

        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}

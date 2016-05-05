package com.javaredefined.javathreadwithcallableinterface.callable;

public class ThreadTest {

    public static void main(String args[]) {
        RunnableThread runnableThread = new RunnableThread();
        Thread thread = new Thread(runnableThread);
        try {
            thread.start();
        } catch (Exception e) {
            System.out.println("caugth");
            e.printStackTrace();
        }
        System.out.println("Runnable thread started");
    }
}

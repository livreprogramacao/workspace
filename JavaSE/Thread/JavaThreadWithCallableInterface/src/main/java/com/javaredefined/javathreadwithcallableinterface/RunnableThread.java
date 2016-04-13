package com.javaredefined.javathreadwithcallableinterface;

public class RunnableThread implements Runnable {

    public void run() throws RuntimeException {
        System.out.println("MyThread run called");
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        throw new NullPointerException();
    }
}

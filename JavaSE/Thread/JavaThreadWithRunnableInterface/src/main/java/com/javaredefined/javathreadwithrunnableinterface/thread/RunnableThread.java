package com.javaredefined.javathreadwithrunnableinterface.thread;

public class RunnableThread implements Runnable {

    public void run() {

        System.out.println("MyThread run called");
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

    }
}

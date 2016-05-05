package com.javaredefined.javathreadwithcallableinterface;

import java.util.concurrent.FutureTask;

public class ThreadTest {

    public static void main(String args[]) {
        CallableThread callableThread = new CallableThread();
        FutureTask futureTask = new FutureTask(callableThread);
        futureTask.run();
        System.out.println("hi");
        try {
            System.out.println(futureTask.get());
        } catch (Exception e) {
        }
    }
}

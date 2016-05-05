package com.javaredefined.javathreadwithcallableinterface;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("in Callable");

        return "finished";
    }

}

package com.KingAm.HelloWorld;

import javax.xml.ws.Endpoint;
//import HelloWorldImpl;

public class HelloWorldPublisher {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/ws/helloWorld", new HelloWorldImpl());
        System.out.println("Hello World Server is published!");

    }

}

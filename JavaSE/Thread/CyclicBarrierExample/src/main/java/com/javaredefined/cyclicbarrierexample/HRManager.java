package com.javaredefined.cyclicbarrierexample;

import java.util.concurrent.CyclicBarrier;

public class HRManager {

    public static void main(String args[]) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

        TechLead techLead1 = new TechLead(cyclicBarrier, "John TL");
        TechLead techLead2 = new TechLead(cyclicBarrier, "Doe TL");
        TechLead techLead3 = new TechLead(cyclicBarrier, "Mark TL");

        techLead1.start();
        techLead2.start();
        techLead3.start();

        System.out.println("No work for HR manager");

    }

}

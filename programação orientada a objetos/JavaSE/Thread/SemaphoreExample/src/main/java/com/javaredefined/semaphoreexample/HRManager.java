package com.javaredefined.semaphoreexample;

import java.util.concurrent.Semaphore;

public class HRManager {

    public static void main(String args[]) {
        Semaphore questionPaperPool = new Semaphore(2);

        TechLead techLead1 = new TechLead(questionPaperPool, "John TL");
        TechLead techLead2 = new TechLead(questionPaperPool, "Doe TL");
        TechLead techLead3 = new TechLead(questionPaperPool, "Mark TL");
        TechLead techLead4 = new TechLead(questionPaperPool, "Albert TL");

        techLead1.start();
        techLead2.start();
        techLead3.start();
        techLead4.start();

        System.out.println("No work for HR manager");

    }

}

package com.javaredefined.semaphoreexample;

import java.util.concurrent.Semaphore;

public class TechLead extends Thread {

    Semaphore questionPaperPool;

    public TechLead(Semaphore questionPaperPool, String name) {
        super(name);
        this.questionPaperPool = questionPaperPool;

    }

    @Override
    public void run() {

        try {

            System.out.println(Thread.currentThread().getName() + " Waiting for test question paper");
            //Acquiring one question paper
            questionPaperPool.acquire();
            System.out.println(Thread.currentThread().getName() + " acquired test paper");
            System.out.println(Thread.currentThread().getName() + " Conducting test");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " Test done giving back the paper");
            //Giving back the acquired question paper
            questionPaperPool.release();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

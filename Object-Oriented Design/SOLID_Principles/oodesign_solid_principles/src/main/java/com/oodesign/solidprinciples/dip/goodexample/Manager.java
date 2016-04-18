package com.oodesign.solidprinciples.dip.goodexample;

public class Manager {

    IWorker worker;

    public void setWorker(IWorker w) {
        worker = w;
    }

    public void manage() {
        worker.work();
    }

}

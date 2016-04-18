package com.oodesign.solidprinciples.dip.badexample;

public class Manager {

    Worker worker;

    public void setWorker(Worker w) {
        worker = w;
    }

    public void manage() {
        worker.work();
    }

}

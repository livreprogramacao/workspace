package com.oodesign.solidprinciples.isp.badexample;


public class Worker implements IWorker {

    @Override
    public void work() {
        // ....working
    }

    @Override
    public void eat() {
        // ...... eating in launch break
    }
    
}

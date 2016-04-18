package com.oodesign.solidprinciples.isp.goodexample;

import com.oodesign.solidprinciples.isp.badexample.*;

/**
 *
 * @author user
 */
public class Manager {

    IWorkable worker;

    public void setWorker(IWorkable w) {
        worker = w;
    }

    public void manage() {
        worker.work();
    }
    
}

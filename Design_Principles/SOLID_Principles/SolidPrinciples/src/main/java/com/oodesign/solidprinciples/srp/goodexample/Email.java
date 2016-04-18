package com.oodesign.solidprinciples.srp.goodexample;

public class Email implements IEmail {

    @Override
    public void setSender(String sender) {
    // set sender; 
    }

    @Override
    public void setReceiver(String receiver) {
    // set receiver; 
    }

    @Override
    public void setContent(IContent content) {
    // set content; 
    }
}

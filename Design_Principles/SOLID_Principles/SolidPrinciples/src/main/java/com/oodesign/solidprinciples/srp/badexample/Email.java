package com.oodesign.solidprinciples.srp.badexample;

/**
 * single responsibility principle - bad example
 * 
 */
class Email implements IEmail {

    @Override
    public void setSender(String sender) {
    // set sender; 
    }

    @Override
    public void setReceiver(String receiver) {
    // set receiver; 
    }

    @Override
    public void setContent(String content) {
    // set content; 
    }
}

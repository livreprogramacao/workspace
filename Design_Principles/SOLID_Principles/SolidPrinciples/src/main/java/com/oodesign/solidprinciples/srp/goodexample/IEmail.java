package com.oodesign.solidprinciples.srp.goodexample;

/**
 * single responsibility principle - good example
 * 
 */
public interface IEmail {

    public void setSender(String sender);

    public void setReceiver(String receiver);

    public void setContent(IContent content);
}

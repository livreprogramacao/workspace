package com.oodesign.solidprinciples.Single_Responsibility_Principle_SRP.goodexample;

/**
 * single responsibility principle - good example
 * 
 */
public interface IEmail {

    public void setSender(String sender);

    public void setReceiver(String receiver);

    public void setContent(IContent content);
}

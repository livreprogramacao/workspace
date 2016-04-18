package com.oodesign.solidprinciples.Single_Responsibility_Principle_SRP.badexample;

interface IEmail {

    public void setSender(String sender);

    public void setReceiver(String receiver);

    public void setContent(String content);
}
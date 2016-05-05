package com.oodesign.solidprinciples.srp.badexample;

interface IEmail {

    public void setSender(String sender);

    public void setReceiver(String receiver);

    public void setContent(String content);
}
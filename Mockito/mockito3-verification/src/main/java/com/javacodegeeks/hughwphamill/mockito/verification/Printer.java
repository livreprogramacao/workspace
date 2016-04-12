package com.javacodegeeks.hughwphamill.mockito.verification;

public interface Printer {

    void printTestPage();

    void turnOff();

    void print(String text, Integer copies, Boolean collate);

}

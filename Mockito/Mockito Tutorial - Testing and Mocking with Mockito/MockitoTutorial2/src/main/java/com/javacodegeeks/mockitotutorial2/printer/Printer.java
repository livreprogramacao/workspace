package com.javacodegeeks.mockitotutorial2.printer;

import com.javacodegeeks.mockitotutorial2.printer.exception.PrinterNotConnectedException;

public interface Printer {

    void printTestPage() throws PrinterNotConnectedException;

}
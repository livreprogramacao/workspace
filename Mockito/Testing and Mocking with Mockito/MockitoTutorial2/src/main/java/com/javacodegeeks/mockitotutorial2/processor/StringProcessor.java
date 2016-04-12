package com.javacodegeeks.mockitotutorial2.processor;

import com.javacodegeeks.mockitotutorial2.printer.Printer;
import java.util.Optional;

public class StringProcessor {

    private Printer printer;
    private String currentBuffer;

    public StringProcessor(Printer printer) {
        this.printer = printer;
    }

    public Optional<String> statusAndTest() {
        printer.printTestPage();
        return Optional.ofNullable(currentBuffer);
    }

}

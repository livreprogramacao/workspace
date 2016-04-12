package com.javacodegeeks.mockitotutorial2.processor;

import com.javacodegeeks.mockitotutorial2.printer.Printer;
import com.javacodegeeks.mockitotutorial2.printer.StringProcessor;
import java.util.Optional;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class StringProcessorTest {

    private Printer printer;

    @Test
    public void internal_buffer_should_be_absent_after_construction() {
        // Given
        StringProcessor processor = new StringProcessor(printer);

        // When
        Optional<String> actualBuffer = processor.statusAndTest();

        // Then
        assertFalse(actualBuffer.isPresent());
    }
}

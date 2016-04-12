package com.javacodegeeks.mockitotutorial2.processor;

import com.javacodegeeks.mockitotutorial2.printer.Printer;
import com.javacodegeeks.mockitotutorial2.printer.SysoutPrinter;
import com.javacodegeeks.mockitotutorial2.printer.exception.PrinterNotConnectedException;
import java.util.Optional;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StringProcessorTest {

    @Mock
    private Printer printer;

    @Test(expected = PrinterNotConnectedException.class)
    public void internal_buffer_should_be_absent_after_construction() throws Exception {
        // Given
        StringProcessor processor = new StringProcessor(printer);
        doThrow(PrinterNotConnectedException.class).when(printer).printTestPage();

        // When
        Optional<String> actualBuffer = processor.statusAndTest();

        // Then
        assertFalse(actualBuffer.isPresent());
    }

    @Spy
    private SysoutPrinter sysoutPrinter;

    @Test
    public void internal_buffer_should_be_absent_after_construction_sysout() throws Exception {
        // Given
        StringProcessor processor = new StringProcessor(sysoutPrinter);
        doNothing().when(sysoutPrinter).printTestPage();

        // When
        Optional<String> actualBuffer = processor.statusAndTest();

        // Then
        assertFalse(actualBuffer.isPresent());
    }

}

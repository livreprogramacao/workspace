package com.javacodegeeks.mockitotutorial1;

import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import org.junit.Test;

@RunWith(MockitoJUnitRunner.class)
public class MyTest {
    
    @Mock
    private List<String> mockList;
    
    @Test
    public void test() {
        String expected = "Hello World!";
        when(mockList.get(0)).thenReturn(expected);
        
        String actual = mockList.get(0);
        assertEquals(expected, actual);
        System.out.println(actual);
    }
    
}
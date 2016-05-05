package com.javacodegeeks;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Stack;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class MockitoCaptorExample {
	
	@Mock Stack<String> stack;
	@Captor ArgumentCaptor<String> argumentCaptor;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetValue() throws Exception {
		stack.add("Java Code Geeks");
		Mockito.verify(stack).add(argumentCaptor.capture());
		assertEquals("Java Code Geeks", argumentCaptor.getValue());
	}
	
	@Test
	public void testGetAllValue() throws Exception {
		stack.add("Java Code Geeks");
		stack.add("Mockito");		
		Mockito.verify(stack, Mockito.times(2)).add(argumentCaptor.capture());
		List<String> values = argumentCaptor.getAllValues();
		assertEquals("Java Code Geeks", values.get(0));
		assertEquals("Mockito", values.get(1));
	}

}

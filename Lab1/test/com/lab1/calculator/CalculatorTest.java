package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator calculator;
	
	@Before 
	public void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void addTest() {
		assertEquals(4, calculator.add(2, 2));
	}
	
	@Test
	public void subtractTest() {
		assertEquals(3, calculator.subtract(5, 2));
	}
	
	@Test
	public void multiplyTest() {
		assertEquals(6, calculator.multiply(3, 2));
	}
	
	@Test
	public void divideTest() {
		assertEquals(4, calculator.divide(8, 2));
	}
	
	@Test
	public void isEqualPositiveTest() {
		assertTrue(calculator.isEqual(3, 3));
	}
	
	@Test
	public void isEqualNegativeTest() {
		assertFalse(calculator.isEqual(3, 1));
	}
//Limitations on basic unit testing could occur because we are not fully testing 
//the entire program so we may not know if the code is shippable or not. 

}
package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Java.Calculations;

class CalculationsTest {

	Calculations calculations = new Calculations();
	
	@Test
	void testAdditionInt() {
	    double a = 1; double b = 2;
		assertEquals(3, calculations.addition(a,b));
	}
	
	@Test
	void testAdditionDouble() {
		double a = 1.5; double b = 2.9;
		assertEquals(4.4, calculations.addition(a,b));
	}
	
	@Test
	void testSubtractionMinus() {
	    double a = 1; double b = 2;
		assertEquals(-1, calculations.subtraction(a,b));
	}
	
	@Test
	void testSubtractionPlus() {
	    double a = 2.5; double b = 1;
		assertEquals(1.5, calculations.subtraction(a,b));
	}
	
	@Test
	void testMultiplicationInt() {
	    double a = 2; double b = 1;
		assertEquals(2, calculations.multiplication(a,b));
	}
	
	@Test
	void testMultiplicationZero() {
	    double a = 2.5; double b = 0;
		assertEquals(0, calculations.multiplication(a,b));
	}

	@Test
	void testMultiplicationDouble() {
	    double a = 2.5; double b = 3;
		assertEquals(7.5, calculations.multiplication(a,b));
	}
	
	@Test
	void testDivisionInt() {
	    double a = 4; double b = 2;
		assertEquals(2, calculations.division(a,b));
	}
	
	@Test
	void testDivisionDouble() {
	    double a = 4.4; double b = 2.2;
		assertEquals(2, calculations.division(a,b));
	}
	
	@Test
	void testDivisionByZero() {
	    double a = 4; double b = 0;
		assertEquals(Double.POSITIVE_INFINITY, calculations.division(a,b));
	}
	
	@Test
	void testDivisionByZeroNegative() {
	    double a = -4.1; double b = 0;
		assertEquals(Double.NEGATIVE_INFINITY, calculations.division(a,b));
	}
	
	@Test
	void testDivisionWithZero() {
	    double a = 0; double b = 4;
		assertEquals(0, calculations.division(a,b));
	}
}

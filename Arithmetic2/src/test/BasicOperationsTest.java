package test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import source.BasicOperations;

public class BasicOperationsTest {
	public static int num1;
	public static int num2;	
	public static int num3;
	public static int num4;
	public static BasicOperations op;

	@BeforeClass
	public static void init() {
		num1 = 7;
		num2 = 28;
		num3 = 75;
		num4 = 2339;
		op = new BasicOperations();
	}
	
	@Test
	public void addTest() {
		assertEquals(82, op.add(num1, num3));
	}
	
	@Test
	public void substractTest() {
		assertEquals(21, op.substract(num2, num1));
	}
	
	@Test
	public void multiplyTest() {
		assertEquals(525, op.multiply(num1, num3));
	}
	
	@Test
	public void divideTest() {
		assertEquals(10, op.divide(num3, num1));
	}
	
	@Test
	public void moduloTest() {
		assertEquals(0, op.modulo(num2, num1));
	}
	
	@Test
	public void isEvenTest() {
		assertTrue(op.isEven(num2));
	}
	
	@Test
	public void isOddTest() {
		assertTrue(op.isOdd(num4));
	}
	
	@Test
	public void isPrimeTest() {
		assertTrue(op.isPrime(num4));
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

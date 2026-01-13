package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import examples.Calculator;

public class TestCalculator2 {                                  //based on JUnit 5 and 6
	
	private Calculator calc;
	
	@BeforeAll
	public static void testStarts() {
		System.out.println("Test Execution Starts");
	}
	
	@AfterAll
	public static  void testEnds() {
		System.out.println("Test Execution Ends");
	}
	
	@BeforeEach
	public void setup() {
		
		calc = new Calculator();
		
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("Destroy Object");
	}
	
	@Test
	public void test001() {
		
		int result = calc.add(3, 4);
		
		assertEquals(7, result);
		
	}

}

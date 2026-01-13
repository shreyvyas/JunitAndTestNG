//package tests;
//
//import static org.junit.Assert.assertEquals;
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//
//import examples.Calculator;
//
//public class TestCalculator1 {                               //based on JUnit4
//	
//	Calculator calc;
//	
//	@BeforeClass
//	public static void testStart() {
//		System.out.println("Test Starts");
//	}
//	
//	@AfterClass
//	public static void testEnds() {
//		System.out.println("Test Ends");
//	}
//	
//	@Before
//	public void beforeEachMethod() {
//		System.out.println("Test Method");
//		calc = new Calculator();
//	}
//	
//	@After
//	public void afterEachMethod() {
//		System.out.println("After Test Method");
//	}
//	
//	@Test
//	public void testMethod() {
//		
//		int result  = calc.add(2, 3);
//		
//		assertEquals(5, result);
//		
//	}
//	
//	
//
//}

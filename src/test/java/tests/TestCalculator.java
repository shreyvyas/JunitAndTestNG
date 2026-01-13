//package tests;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//
//import org.junit.Test;
//
//import examples.Calculator;
//
//public class TestCalculator {
//	
//	Calculator calc = new Calculator();                      //based on JUnit4
//	
//	@Test
//	public void test001() {		
//		
//		int result = calc.add(2, 3);
//		
//		assertEquals(5, result);
//		
//	}
//	
//	@Test
//	public void test002() {
//		
//		int result = calc.add(0, 0);
//		
//		assertEquals(0, result);
//		
//	}
//	
//	@Test
//	public void test003() {
//		
//		int result = calc.add(-1, 5);
//		
//		assertEquals(4, result);
//		
//	}
//	
//	@Test
//	public void test004() {
//		
//		int result = calc.add(2,5);
//		
//		assertTrue(result < 10);
//		
//	}
//	
//	
//	
//	
//
//}

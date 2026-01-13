package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;

import examples.Calculator;

public class ParamterizedTest {
	
	Calculator calc;
	
	
	@ParameterizedTest
	@CsvSource({
		
		"1,2,3",
		"2,3,5",
		"-1,3,2",
		"0,0,0"
		
	})
	public void test001(int a, int b, int expected) {
		
		calc = new Calculator();
		
		assertEquals(expected, calc.add(a, b));
		
	}

}

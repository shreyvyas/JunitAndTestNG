package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class AnnotationsTest {
	
	@Test
	@DisplayName("Display Name Annotation")
	void test001() {
		System.out.println("It will display test name");
	}
	
	@Test
	@Disabled("Blocked this test")
	void test002() {
		System.out.println("This Test will be blocked");
	}
	
	@Tag("smoke")
	@Test
	void smokeTest() {
		System.out.println("Smoke Test");
	}
	
	@RepeatedTest(5)
	void repeatTest() {
		System.out.println("It will be executed 5 times");
	}

}

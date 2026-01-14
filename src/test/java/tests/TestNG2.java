package tests;

import org.testng.annotations.Test;

public class TestNG2 {
	
	@Test(description="Test 01", priority=1, groups={"smoke"})
	public void test01() {
		System.out.println("test 01");
	}
	
	@Test(description="Test 02", priority=2, groups={"regression"})
	public void test02() {
		System.out.println("test 02");
	}
	
	@Test(description="Test 03", priority=3, groups={"smoke"})
	public void test03() {
		System.out.println("test 03");
	}

}

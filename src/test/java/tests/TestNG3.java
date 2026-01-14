package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG3 {
	
	@Test(priority=1)
	public void test01() {
		System.out.println("test 1 - step 1");
		Assert.assertTrue(10>11);	
		System.out.println("test 1 - step 2");
	}
	
	@Test(priority=2)
	public void test02() {
		
		Assert.assertTrue(10>5);
		
	}
	
	@Test(priority = 3)
	public void test03() {
		
		System.out.println("step 1");
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(10>11);
		
		System.out.println("step 2");
		
	}

}

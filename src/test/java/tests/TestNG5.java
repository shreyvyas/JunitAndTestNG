package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.TestDataProvider;

@Listeners(utilities.TestListener.class)
public class TestNG5 {
	
	@Test(dataProvider="dataprovider", dataProviderClass = TestDataProvider.class)
	public void testCase01() {
		
		System.out.println("TestData");
		
	}

}

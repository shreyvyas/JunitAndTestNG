package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG4 {
	
	
	@Test
	@Parameters({"param1", "param2"})
	public void test01(int a, int b) {
		
		System.out.println(a);
		
		System.out.println(b);
		
	}
	
	@DataProvider(name="dataprovider")
	public Object[][] getData(){
		
		return new Object[][]{
			
			{1,2},
			{3,4},
			{-1,0}
		};
		
	}
	
	
	@Test(dataProvider="dataprovider")
	public void test02(int a, int b) {
		
		System.out.println(a+b);
		
	}

}

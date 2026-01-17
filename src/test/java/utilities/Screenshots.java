package utilities;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {
	
	protected static WebDriver driver;
	
	
	public static void getScreenShot(String testCaseName) {
		
		String fileName = UUID.randomUUID() + "_" + testCaseName + ".png";
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		
		File src = ss.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\admin\\eclipse-workspace\\frameworkdesign\\Screenshots"+fileName);
		
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	

	

	
	
}


//File source = ss.getScreenshotAs(OutputType.FILE);
//
//File destination = new File("C:\\Users\\admin\\eclipse-workspace\\frameworkdesign\\Screenshots");
//
//FileUtils.copyFile(source, destination);

//above commented lines are not allowed directly in the class
//it should be in the method
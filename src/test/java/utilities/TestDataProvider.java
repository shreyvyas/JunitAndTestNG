package utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class TestDataProvider {
	
	@DataProvider(name="dataprovider")
	public Object[][] getData(){
		
		Object[][] testData = null;
		
		try {
			
			File file = new File("C:\\Users\\admin\\eclipse-workspace\\frameworkdesign\\resources\\TestData.xlsx");
			FileInputStream fis = new FileInputStream(file);
			
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = workbook.getSheet("TestCase01");
			
			int totalRows = sheet.getPhysicalNumberOfRows();
			System.out.println(totalRows);
			
			XSSFRow row = sheet.getRow(0);
			int totalCol = row.getLastCellNum();
			System.out.println(totalCol);
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return testData;
	}

}

package emids.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ReadFromExcel {
	
	@Test
	public void readexcel() throws IOException {
		
		File file = new File ("C:\\Users\\Harsha Patil\\Desktop\\Pavithra\\TestData.xlsx");
		
		FileInputStream inputstream = new FileInputStream(file);
		
		// create workbook instance 
		
		HSSFWorkbook  wb = new HSSFWorkbook(inputstream);
		
		// create sheet instance 
		
		HSSFSheet sheet = wb.getSheetAt(1);
		
		// create row object 
		
		HSSFRow  row = sheet.getRow(2);
		
		// create cell object
		
		HSSFCell cll = row.getCell(2);
		
		String username = cll.getStringCellValue();
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Harsha Patil\\Documents\\dev\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@placeholder='Userna']")).sendKeys(username);

		
		
		
		
		
		
		
		
		
	}
	
	

}

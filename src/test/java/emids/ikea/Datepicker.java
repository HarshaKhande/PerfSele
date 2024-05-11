package emids.ikea;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	
		
		public static void main(String[] args) throws InterruptedException {
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha Patil\\Documents\\dev\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			// navigate- launch the browsers
			
			driver.get("https://demo.guru99.com/test/");

			Thread.sleep(500);
			
			WebElement date = driver.findElement(By.xpath("//input[@name='bdaytime']"));
			
			date.sendKeys("09252013");
			
			date.sendKeys(Keys.TAB);
			
			date.sendKeys("0245PM");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			



	}

}

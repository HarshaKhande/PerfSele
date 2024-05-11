package emids.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Runfailedscenario {
	
	@Test 
	public void testcase1() {
		
		System.out.println("Testcase1");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha Patil\\Documents\\dev\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//https://www.selenium.dev/
		
		driver.get("https://www.selenium.dev/");
		
	}

}

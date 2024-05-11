package emids.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterizedtest {
	
	
	@Parameters("browser")
	@Test
	public void  parametizedmethod(String browser) {
		
		if(browser.equals("Chrome")) {
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha Patil\\Documents\\dev\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.selenium.dev/");
			
			
		}else if (browser.equals("Edge")) {
			
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Harsha Patil\\Documents\\dev\\Drivers\\edgedriver_win64\\msedgedriver.exe");
			
			WebDriver driver = new EdgeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.selenium.dev/");
		}
		
		
		
		
		
		
		
		
	}

}

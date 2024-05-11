package emids.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestNgListner.class)
public class testnglistnereg {
	
	@Test
	public void login() {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Harsha Patil\\Documents\\dev\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@placeholder='Userna']")).sendKeys("harsha");
		
		
	}

}

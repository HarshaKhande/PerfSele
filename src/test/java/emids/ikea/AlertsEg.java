package emids.ikea;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsEg {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha Patil\\Documents\\dev\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			// navigate- launch the browsers
			
			driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			
			Thread.sleep(4000);
			
			WebElement simplealert = driver.findElement(By.xpath("//input[@name='alert']"));
			
			simplealert.click();
			
			Alert alt = driver.switchTo().alert();
			
			// clicking on ok button
			
			alt.accept();
			

			Thread.sleep(4000);
			
			// confirmational alerts 
			
			WebElement confalert = driver.findElement(By.xpath("//input[@name='confirmation']"));
			
			confalert.click();
			
			Alert alt1 = driver.switchTo().alert();
			
			// clicking on dismiss button
			
			alt1.dismiss();
			
			Thread.sleep(4000);
			
			// prompt alerts 
			
			WebElement prompalert = driver.findElement(By.xpath("//input[@name='prompt']"));
			
			prompalert.click();
			
			Alert alt2 = driver.switchTo().alert();
			
			// clicking on dismiss button
			
			alt2.sendKeys("Harsha");
			

			Thread.sleep(4000);
			
			
			
			
			


	}

}

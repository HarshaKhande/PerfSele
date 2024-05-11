package emids.ikea;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckbx {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha Patil\\Documents\\dev\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// navigate- launch the browsers
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		
		username.sendKeys("Admin");
		
		WebElement password  = driver.findElement(By.xpath("//input[@name='password']"));
		
		password.sendKeys("admin123");
		
		WebElement login  = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	
		login.click();
		
		Thread.sleep(3000);
		
		//WebElement PIM = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]"));
		
		//PIM.click();
		
		// scroll down
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,600)", 0);
		
		List<WebElement> chkboxs = driver.findElements(By.xpath("//i[@class= 'oxd-icon bi-check oxd-checkbox-input-icon']"));
		
		int size = chkboxs.size();
		
		System.out.println(size);	
		
		for (int i = 2 ; i < size ; i++ ) {
			
		chkboxs.get(i).click();
		
		}
		
		Thread.sleep(1000);
		
		
		


	}

}

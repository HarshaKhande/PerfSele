package emids.ikea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsEg {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha Patil\\Documents\\dev\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		// id locator 
		
		driver.findElement(By.id("email")).sendKeys("hkhande@gmail.com");
		
		// name locator 
		
		driver.findElement(By.name("pass")).sendKeys("1234");
		
		// class locator 
		
		driver.findElement(By.className("inputtext _55r1 inputtext _9npi inputtext _9npi")).sendKeys("1234");
		
		// link text
		
		driver.findElement(By.linkText("Log in")).click();
		
		// partial link text
		
		driver.findElement(By.partialLinkText("Log")).click();
		
		// href
		
		driver.findElement(By.tagName("https://www.facebook.com/recover/initiate/?ars=facebook_login&amp;cancel_lara_pswd=0")).click();
		
		// css selector 
		
		driver.findElement(By.cssSelector("div.orangehrm-login-layout div.orangehrm-login-layout-blob div.orangehrm-login-container div.orangehrm-login-slot-wrapper div.orangehrm-login-slot div.orangehrm-login-form form.oxd-form div.oxd-form-row:nth-child(2) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) > input.oxd-input.oxd-input--active")).click();
		
		
		
		
		
		
		
		
		



	}

}

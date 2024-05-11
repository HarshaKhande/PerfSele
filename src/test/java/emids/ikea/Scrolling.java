package emids.ikea;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {


		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha Patil\\Documents\\dev\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// navigate- launch the browsers
		
		driver.get("https://www.amazon.in/");
		
		WebElement contact = driver.findElement(By.xpath("//h2[contains(text(),'Today’s Deals')]"));
			
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", contact);
		
		Thread.sleep(500);
		
		// down ward scroll
		
		js.executeScript("window.scrollBy(0,600)", "");
		
		Thread.sleep(500);
		
		// upward scroll
		
		js.executeScript("window.scrollBy(0,-800)", 0);
		
		Thread.sleep(500);
		
		
		
		
		
		
		
	}

}

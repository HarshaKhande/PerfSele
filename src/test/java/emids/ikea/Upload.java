package emids.ikea;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha Patil\\Documents\\dev\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// navigate- launch the browsers
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement upload  = driver.findElement(By.xpath("//input[@name='upload']"));
		
		upload.sendKeys("C:\\Users\\Harsha Patil\\Desktop\\QATraining\\image.png");
		
		Thread.sleep(500);


	}

}

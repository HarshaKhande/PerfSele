package emids.ikea;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DRopDowneg {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha Patil\\Documents\\dev\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// navigate- launch the browsers
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		// implicit wait
		
		
		
		Thread.sleep(4000);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		Select sel = new Select(dropdown);
		
		sel.selectByIndex(1);
		
		Thread.sleep(4000);
		
		sel.selectByVisibleText("Option 2");
		
		Thread.sleep(4000);
		
		sel.selectByValue("1");
		
		





	}

}

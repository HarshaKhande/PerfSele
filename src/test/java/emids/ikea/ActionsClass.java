package emids.ikea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha Patil\\Documents\\dev\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// navigate- launch the browsers
		
		driver.get("http://www.automationpractice.pl/index.php?id_category=3&controller=category");

		Thread.sleep(500);
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='My Shop']"));
		
		Actions act = new Actions(driver);
		
		// double click
		
		act.doubleClick(logo).perform();
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		
		act.contextClick(women).perform();
		
		
		
		

	}

}

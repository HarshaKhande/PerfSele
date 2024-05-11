package emids.ikea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha Patil\\Documents\\dev\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// navigate- launch the browsers
		
		driver.get("http://www.dummypoint.com/DragAndDrop.html");

		Thread.sleep(500);
		
		WebElement src = driver.findElement(By.xpath("//p[@id='drag']"));
		
		WebElement dest = driver.findElement(By.xpath("//div[@id='drop']"));
		
		
		Actions act = new Actions(driver);
		
		// double click
		
		act.dragAndDrop(src, dest).perform();
		
		Thread.sleep(500);



	}

}

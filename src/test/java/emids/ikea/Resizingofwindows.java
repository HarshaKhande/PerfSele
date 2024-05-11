package emids.ikea;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resizingofwindows {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha Patil\\Documents\\dev\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// navigate- launch the browsers
		
		driver.get("https://jqueryui.com/resizable/");
		

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		//driver.switchTo().frame(frame);
		
		driver.switchTo().frame(0);
		
		//WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']"));
		

		int width = 200;
		
		int height = 300;
		
		Dimension dim = new Dimension(width, height);
		
		driver.manage().window().setSize(dim);
		
		



	}

}

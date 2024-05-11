package emids.ikea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checbox {

	public static void main(String[] args) {


		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha Patil\\Documents\\dev\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// navigate- launch the browsers
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement chbox1 = driver.findElement(By.xpath("(//input[@type = 'checkbox'])[2]"));
		
		if (chbox1.isDisplayed()) {
			
			chbox1.click();
		}else {
			
			System.out.println("Checkbox is not displayed");
		}
		
		
		
		
		
		

	}

}

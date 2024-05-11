package emids.ikea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Errormessagevalidation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha Patil\\Documents\\dev\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// navigate- launch the browsers
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement login = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		
		login.click();
		
		String expectedmsg = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		
		WebElement msg = driver.findElement(By.xpath("//div[@class='_9ay7']"));
		
		String actualmsg = msg.getText();
		
		System.out.println(actualmsg);
		
		if(expectedmsg.equalsIgnoreCase(actualmsg)) {
			
			System.out.println("The message is matching");
		}else {
			
			System.out.println("The message is not matching");
		}
		
		
		
		
		



	}

}

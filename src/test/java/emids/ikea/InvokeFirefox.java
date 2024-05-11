package emids.ikea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InvokeFirefox {

	public static void main(String[] args) {


		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Harsha Patil\\Documents\\dev\\Drivers\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
	}

}

package emids.ikea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowsersCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha Patil\\Documents\\dev\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// get - launch the browsers
		
		driver.get("https://www.selenium.dev/");
		
		// title
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		// get page source
		
		String pgsrc = driver.getPageSource();
		
		System.out.println(pgsrc);
		
		// get current url 
		
		String currurl = driver.getCurrentUrl();
		
		System.out.println(currurl);
		
		// driver.close - closes the current browser session.
		
		// driver.quit
		
		


	}

}

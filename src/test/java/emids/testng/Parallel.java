package emids.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel {

	// testcase 1

	// @Test will help the Testng to execute the method

	@Test
	public void testcase1() {

		System.out.println("Testcase1");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Harsha Patil\\Documents\\dev\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/");

	}

	@Test
	public void testcase2() {

		System.out.println("Testcase3");

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Harsha Patil\\Documents\\dev\\Drivers\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/");
	}

}

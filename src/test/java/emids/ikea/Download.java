package emids.ikea;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha Patil\\Documents\\dev\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// navigate- launch the browsers
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement download  = driver.findElement(By.xpath("//input[@name='download']"));
		
		download.click();
		
		Thread.sleep(500);

		// Mention the specific file path 
       // String filePath = "C:\\Users\\Harsha Patil\\Downloads\\Daywise Agenda"; 
  
        String filename = "Daywise";

		boolean flag = false;

		String dirPath = "C:\\Users\\Harsha Patil\\Downloads";

		File dir = new File(dirPath);

		File[] files = dir.listFiles();

		if (files.length == 0 || files == null) {

			System.out.println("The directory is empty");
		} else {

			for (File listFile : files) {

				if (listFile.getName().contains(filename)) {

					System.out.println(filename);

				}

				flag = true;

			}

		}

	}

}

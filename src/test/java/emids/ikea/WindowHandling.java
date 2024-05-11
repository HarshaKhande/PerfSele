package emids.ikea;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
	// window handling 
	
	// 1. windowhandle() of the parent session - 16 digit session id 
	// 2. click on element in the parent tab
	// 3 . get the windowhandles() - parent and child window 2 session ids 
	// 4. iterate in the session ids and see that parent is not equal to child, moving the control to child window
	// 5. do the action on the child window
	// 6. come back to parent window 
	
	
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha Patil\\Documents\\dev\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	// navigate- launch the browsers
	
	driver.get("http://www.dummypoint.com/Windows.html");

	Thread.sleep(500);
	
	
	// get the parent window handle
	
	String parentwindow = driver.getWindowHandle();
	
	System.out.println(parentwindow);
	
	WebElement pop = driver.findElement(By.xpath("//input[@value='Open a Popup Window']"));
	
	pop.click();
	
	// 3 . get the windowhandles() - parent and child window 2 session ids 
	
	Set<String> windowhandles = driver.getWindowHandles();
	
	System.out.println(windowhandles);
	
	// 4. iterate in the session ids and see that parent is not 
	//equal to child, moving the control to child window
	
	Iterator<String> iterator = windowhandles.iterator();
	
	while (iterator.hasNext()) {
		
		String childwindow = iterator.next();
	
		if (!parentwindow.equalsIgnoreCase(childwindow)) {
			
			driver.switchTo().window(childwindow);
			
			WebElement fr = driver.findElement(By.xpath("//h1[@id = 'framename']"));
				
			String text = fr.getText();
			
			System.out.println(text);
					
			driver.close();
			
		}
		
	}
	
	
	



	}

}

package emids.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class grouping {
	
	// testcase 1 
	
	// @Test will help the Testng to execute the method 
	
	
	@Test ( groups = {"Sanity"})
	public void testcase1() {
		
		System.out.println("Testcase1");
		
	
		
	}
	
	@Test (  groups = {"Sanity"})
	public void testcase2() {
		
		System.out.println("Testcase2");
		
		
	}
	
	@Test (groups = {"Regression"})
	public void testcase3() {
		
	System.out.println("Testcase 3");
	}
	
	@Test (groups = {"Regression"}) 
	public void testcase4() {
		
		System.out.println("Testcase4");
	}
	

}

package emids.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngAnnotations {
	
	// Test case1
	
	@Test
	public void testcase1() {
		
		System.out.println("Testcase1");
	}
	
	@Test
	public void testcase2() {
		
		System.out.println("Testcase2");
	}
	
	@BeforeSuite
	public void beforesuite() {
		
		System.out.println("Before suite");
	}
	
	@AfterSuite
	public void aftersuite() {
		
		System.out.println("after suite");
	}
	
	@BeforeMethod
	public void beforemethod() {
		
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void aftermethod() {
		
		System.out.println("afterr Method");
	}
	
	@BeforeClass
	public void beforeclass() {
		
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterclass() {
		
		System.out.println("after class");
	}
	
	@BeforeTest
	public void beforetest() {
		
		System.out.println("Before test");
	}
	
	@AfterTest
	public void aftertest() {
		
		System.out.println("after test");
	}
	
	
	
	
	
	
	
	

}

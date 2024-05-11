package emids.testng;

import org.testng.annotations.Test;

public class DependsOnMethodEg {
	
	@Test(enabled = false)
	public void testcase1() {
		
		System.out.println("testcase1");
	}
	
	@Test(dependsOnMethods = {"testcase1"})
	public void testcase2() {
		
		System.out.println("testcase2");
	}
	
	@Test
	public void testcase3() {
		
		System.out.println("testcase3");
	}
	
	
	

}

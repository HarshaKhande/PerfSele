package emids.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListner implements ITestListener {
	
	 @Override		
	    public void onFinish(ITestContext arg0) {					

		 System.out.println("The testcase execution is completed ");
	        		
	    }		

	    @Override		
	    public void onStart(ITestContext arg0) {					

	    	 System.out.println("The testcase execution is started ");
	        		
	    }		

	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					

	    	 System.out.println("The testcase execution is completed with few issues ");
	        		
	    }		

	    @Override		
	    public void onTestFailure(ITestResult arg0) {	
	    	
	    	 System.out.println("The testcase execution is failed ");
	     
	    }		

	    @Override		
	    public void onTestSkipped(ITestResult arg0) {					
	        		
	    	 System.out.println("The testcase execution is skipped ");	
	    }		

	    @Override		
	    public void onTestStart(ITestResult arg0) {					
	     		
	    	 System.out.println("The testcase execution is started");
	        		
	    }		

	    @Override		
	    public void onTestSuccess(ITestResult arg0) {	
	    	
	    	 System.out.println("The testcase execution is completed successfully ");
	       
	    }		
	

}

package testFW;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;


public class TestB {
	public static int pass=0,fail=0;
	@AfterMethod
	public void closeApp(ITestResult iTestResult) {
		if(iTestResult.getStatus()==2){
			fail++;
		}
		else{
			pass++;
		}
		}
	@AfterSuite
	public void end(){
		System.out.println(pass);
		System.out.println(fail);
		
	}
	@Test
	public void testA(){
		Reporter.log("testA1", true);
		Assert.fail();
	}
	@Test
	public void testA1(){
		Reporter.log("testA1", true);
	}

}

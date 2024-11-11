package TestClass_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Test_enabled_Test_suite {
	
	//There are two methods to disable the tests 
	//1.By using enabled 
	//2.By using Test Suite---to run the failed tests from regression suite using include and exclude keywords
	//3.choose failed.xml from test output

	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method");
	}
	
	@Test
	public void TC01() {
		System.out.println("TC01");
	}
	
	@Test    
	public void TC02() {			  
		System.out.println("TC02");
	}
	
	@Test
	public void TC03() {
		int a=5/0;
		
		System.out.println("TC03");
	}
	
	@Test
	public void AC04() {
		int b=7/0;
		System.out.println("TC04");
	}
	
	@Test
	public void TC05() {
		System.out.println("TC05");
	}
	
	
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("After Class");
	}
	
	
}

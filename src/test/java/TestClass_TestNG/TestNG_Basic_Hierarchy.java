package TestClass_TestNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Basic_Hierarchy {
 
	@BeforeClass
	public void beforeclass(){
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method");
	}
	
	@Test
	public void TC01() {
		System.out.println("Test Case 01");
	}
	
	@Test
	public void TC02() {
		System.out.println("Test Case 02");
	}
	
	@Test
	public void TC03() {
		System.out.println("Test Case 03");
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

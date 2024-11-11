package TestClass_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Keywords {

	//1. priority 
	//2. invocationcount
	//3. timeout
	//4. dependson
	//5. enabled
	
	//1. priority
	//we can set priority to test or test case by using 'priority' keyword  so test will execute in a order according to priority given to the test
	//By default priority is 0(when we don't specifies priority) but priority can be -ve,0 and +ve.
	//If priority is not given to the test then tests will execute in alphabetically order
	//If two tests have same priority then it will check alphabetically between those tests which should execute first according to alphabetically and then second and so on
	
	
	//2.invocationCount---to execute the any test multiple time ,mostly used while retesting
	
	//3.timeOut---if any test takes some time to excute then we can specify timeout for that test and within that time if test not executed successfully then that test will get failed
	
	//4.dependsOnMethods---if we declare any test case depends on another then first, test that we declare with depends on keyword will execute and another test depends on that test
	//if test with dependon keyword fails then the test which depends on that test will also fail.
	//we can use multiple methods in dependsoNMethod
	
	//5.enabled---if we have multiple tests but among those test we want to only execute specific tests and others should be disable then that time we'll use 
	//enable keyword as @Test(enabled=false) so this perticular test will not execute .i.e gets disabled.
	
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method");
	}
	
	@Test(invocationCount=2)
	public void TC01() {
		System.out.println("TC01");
	}
	
	@Test(dependsOnMethods="TC03")    //here TC02 depends on TC03.i.e TC02 will execute only when TC03 executed successfully. 
	public void TC02() {			  //If TC03 fails then TC02 also fails
		System.out.println("TC02");
	}
	
	@Test(timeOut=2000)
	public void TC03() {
		System.out.println("TC03");
	}
	
	@Test(priority=2)
	public void AC04() {
		System.out.println("TC04");
	}
	
	@Test(enabled=false)         //here we disabled this test so it will not execute
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

package TestClass_TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hard_Assert {
// used for validations
	//There are two types of assert 
	//1. Hard Assert --> Classname-Assert , Methods->static
	//2. Soft Assert --> Classname-SoftAssert , Methods->non-static
	
	//1. Hard Assert: No need to create object as methods are static and return type for all methods is void
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class");
	}
	
	@Test
	public void TC01() {
		
		String exp_url="Google.com";
		String act_url="Google.com";
		
		Assert.assertEquals(act_url, exp_url);             //first argument is always actual one and second one is for expected
		 //multple methods with same .assertEquals are available in Assert class but diff arguments so it is example of method overloadin(compiletime polymorphism)
		System.out.println("The url is same");				//when hard assert fails in perticular test then no assert will execute after that assert but other tests may get passed
	
		boolean b1=true;
		
		
		
		Assert.assertTrue(b1);			//fail    ---so in argument we can pass method whose return type is boolean or directy pass method
		Assert.assertTrue(b1);			//pass
		
		Assert.assertFalse(false);			//pass
		Assert.assertFalse(false);			//fail
		
	//to print the message with assert result then we can use as follows:
		
		//Assert.assertFalse(b1, "This assertion is passed");    //when assertion is passed then it will not print the message
															  //but when assertion is failed it will print the message
		//to fail the assertion forcefully:
		Assert.fail();
		
	}
	
	@Test   
	public void TC02() {
		
		String exp_url1="Google.com";
		String act_url1="Googe.com";
		
		Assert.assertNotEquals(act_url1, exp_url1);     //this will pass only if both exp_utl1 and act_url1 is not same
	}
	
	
	
	@AfterClass
	public void afterclass() {
		System.out.println("After Class");
	}
	
	
}

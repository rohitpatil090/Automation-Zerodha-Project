package TestClass_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {

	//method of SoftAssert are non static so we have to create the object of class
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class");
	}
	
	@Test
	public void TC01() {
		
		String exp_url="Google.com";
		String act_url="Google.com";
		
		SoftAssert soft=new SoftAssert();
		
		soft.assertEquals(act_url, exp_url);					//pass
		System.out.println("Assert1");
		//soft.assertNotEquals(act_url, exp_url);					//fail
		System.out.println("Assert2");							
		soft.assertTrue(true);									//pass
		System.out.println("Assert3");
		soft.assertFalse(false);								//pass
		System.out.println("Assert4");
		//soft.assertFalse(true);									//fail
		System.out.println("Assert5");
		//soft.assertFalse(true);									//fail
		System.out.println("Assert6");
	
		
		//unless and until we use soft.assertAll(); all asserts will passed ,here second assert should have to fail but it not so we have to use assertAll()
		soft.assertAll();						//---imp method  -- 3 assert will fail here
		System.out.println("method end");			//so if any assertion fails then whatever we have written after .assertAll() method will not execute or print
																	//so ultimately that means Test also fails when any assertion fails in soft assert
	}
	
	@Test   
	public void TC02() {
		
		
	}
	
	
	
	@AfterClass
	public void afterclass() {
		System.out.println("After Class");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

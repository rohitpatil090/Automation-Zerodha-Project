package Parallel_Testing;

import org.testng.annotations.Test;

public class ParallelTest1 {
	
	//TO perform Parallel testing we have to use TestNg suite.i.e testng.xml file
	//In that file if we want run parallel testing on classes then we have to mention parallel="classes" in test tag.
	//And if we want do parallel testing test then we have to mention parallel="test" in suite tag.
	//If we mention both classes and test to parallel then everything will run parallely.
	//If we made test to parallel but not for classes then one class from test1 and one class from test2 will run parallely and after that cursor goes to 2nd line
	//And second class from test1 and second class from test2 will execute parallely and so on....
	//thread-count ="3" that means only 3 test classes will run parallely rest will not
	//Only if we have less time and higher authorities wants reprts of tests then we'll do parallel testing else it is not recommended(rarely used)
	
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
		System.out.println("TC03");
	}
}

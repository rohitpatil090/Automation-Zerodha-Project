package TestClass_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Grouping_methods {
	
	//for grouping we have to use 'groups' keyword in Test Annotation and value for groups should be in 'String'
	//to execute this grouping we have to execute TestSuite .i.e 'testng.xml' file
	//in that we have to add same <groups> tag inside <test> tag and inside <groups> tag we ahve to use <run> tag
	//after that we have to use <include name="groups name value"></include>
	//we can use <exclude> too in this to exclude some groups.For Exclude other than Tests specified in exclude tag all other tests will execute
	//depends on include and exclude only respective tests will execute according to groups
 	//vimp--Also we have to specify Package.classname inside <class> tag for perticular tests.
	//so here <class name="TestClass_TestNG.Grouping_methods"></class>
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method");
	}
	
	@Test(groups="Sanity")
	public void TC01() {
		System.out.println("TC01");
	}
		
	@Test(groups="Regression")
	public void TC02() {
		System.out.println("TC01");
	}
	@Test(groups="Sanity")
	public void TC03() {
		System.out.println("TC01");
	}

	@Test(groups="Regression")
	public void TC04() {
		System.out.println("TC01");
	}

	@Test
	public void TC05() {
		System.out.println("TC01");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("After Class");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("After Method");
	}
	
}

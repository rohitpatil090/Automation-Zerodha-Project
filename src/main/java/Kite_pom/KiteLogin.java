package Kite_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin{

	//In pom class we don't write main method...so no brpwser launching pom class
	//pom class is tightly encapsulated .i.e all datamembers or variables declared as private
	
	//1.Declaration
	
	@FindBy(xpath="//input[@type='text']")					//It is a annotation used to declare & locate the WebElement and all webelement declaration is private 
	private WebElement UserID;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	//2.Initialization:- Initialization of pom class by using 'Constructor'
	//class name and constructor name should be same
	
	public KiteLogin(WebDriver driver)								//constructor  and declare it public so that we can access it in TestPackage
	{
		PageFactory.initElements(driver, this);			//initElements is a static method of Pagefactory class and is used for initialization of webelement
	}
	
	//this-->PageFactory.initElements(); method if failed to locate and initialize webelement at start then it won't throw any exception but while
	//performing actions on web element again it will try to initialize the webelement and if it fails again then that method throws respective exception
	//and if it succeeds then code run successfully.
	
	
	//3. Usage:-Methods(Actions) -- all methods should be public
	
	//Action---- 'Webelement.methodname'      ---(these methods are perform on webelement and thase are selenium methods)
	public void enterUserID(String user) {												//use method name that makes sense and unique
		UserID.sendKeys(user);
	}
			
	public void enterPassword(String pswd) {												
		password.sendKeys(pswd);
	}
	
	public void clickOnLoginButton() {												
		login.click();
	}
		
	
	
	
	
	
	
	
	
	
}

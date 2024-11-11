package Kite_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin_2FA {
	
	
	//1.Declaration
	
	@FindBy(xpath=("//input[@id='pin']"))
	private WebElement pin_2FA;
	
	
	@FindBy(xpath="//button[text()='Continue ']")
	private WebElement continue_button;
	
	//2.Initialization
	
	public KiteLogin_2FA(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	//3.Usage-methods
	
	
	public void moveTO2FAPin(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(pin_2FA).build().perform();
	}
		
	public void enter2FAPin(String pin) throws InterruptedException	{
		pin_2FA.sendKeys(pin);     									//this keyword is used to get the value w/o hardcoding and passing parameter in 
		Thread.sleep(2000);													   //sendkeys and in method. and actual value we'll pass in Test Class	
		
	}
	
	public void clickOnContinueButton() throws InterruptedException {
		continue_button.click();
		Thread.sleep(2000);
	}
	
}

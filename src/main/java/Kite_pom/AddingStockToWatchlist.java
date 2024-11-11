package Kite_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingStockToWatchlist {

	//1. Declaration
	@FindBy(xpath="//li[@data-balloon='COMMODITY']")
	private WebElement watchlist;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement Add_instrument_SearchBox;
	
	@FindBy(xpath="//span[text()='NICKEL JUL FUT']")
	private WebElement Add_script;
	
	
	//2. Initialization
	public AddingStockToWatchlist(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3. Methods
	
	public void clickOnCommodityWatchlist() throws InterruptedException {
		watchlist.click();
		Thread.sleep(2000);
	}

	public void clickOnAddInstrumentSearchBox(String instrument) throws InterruptedException {
	Add_instrument_SearchBox.sendKeys(instrument);
		Thread.sleep(2000);
	}		
	public void AddScriptToWatchlist() throws InterruptedException {
		Add_script.click();
		Thread.sleep(2000);

	}
	
	
}

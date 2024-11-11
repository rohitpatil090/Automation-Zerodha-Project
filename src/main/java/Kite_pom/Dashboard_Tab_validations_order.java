package Kite_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_Tab_validations_order {

	//1. Declaration
	
		@FindBy(xpath="//span[text()='Orders']")
		private WebElement order_tab;
		
		@FindBy(xpath="//span[text()='GTT']")
		private WebElement GTT;
		
		@FindBy(xpath="//span[text()='Baskets']")
		private WebElement Baskets;
		
		@FindBy(xpath="//span[text()='SIP']")
		private WebElement SIP;
		
		@FindBy(xpath="//span[text()='Alerts']")
		private WebElement Alerts;

		@FindBy(xpath="//span[text()='IPO']")
		private WebElement IPO;
	

	//2. Initialization

		public Dashboard_Tab_validations_order(WebDriver driver) {
			
			PageFactory.initElements(driver, this);	
			
		}

	//3.Actions or methods on WebElements

		public void clickOnOrdersTab() {
			order_tab.click();
		}

		public void clickOnGTTtab() {
			GTT.click();
		}

		public void clickOnBasketsTab() {
			Baskets.click();
		}

		public void clickOnSIPTab() {
			SIP.click();
		}
		
		public void clickOnAlertsTab() {
			Alerts.click();
		}
		
		public void clickOnIPOTab() {
			IPO.click();
			
		}

		


}
package Kite_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_Tab {

	//1. Declaration
	
			@FindBy(xpath="//span[text()='Dashboard']")
			private WebElement Dashboard_tab_;
		

		//2. Initialization

			public Dashboard_Tab(WebDriver driver) {
				
				PageFactory.initElements(driver, this);	
				
			}

		//3.Actions or methods on WebElements

			public void clickOnDashboardTab() throws InterruptedException {
				Dashboard_tab_.click();
				Thread.sleep(2000);
			}

			
	
}

package Kite_pom;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Holdings_Tab {

	
	//1. Declaration
	
	@FindBy(xpath="//span[text()='Holdings']")
	private WebElement Holdings_Tab_;
	
	@FindBy(xpath="//div[@name='holdings-selector']//select")
	private WebElement Holdings_selector;
	
	


	//2. Initialization

	public Holdings_Tab(WebDriver driver) {
		
		PageFactory.initElements(driver, this);	
		
	}

	//3.Actions or methods on WebElements

	public void clickOnHoldingsTab() throws InterruptedException {
		Holdings_Tab_.click();
		Thread.sleep(2000);
		
		
		//Getting All the options from Holdings listbox
				
		Select s=new Select(Holdings_selector);

		List <WebElement> holding_list=s.getOptions();
		int list_size=holding_list.size();

		for(int i=0; i<list_size; i++)
		{
			WebElement a=s.getOptions().get(i);
			String option_text=a.getText();
			System.out.println(option_text);

		}
		
	}

}

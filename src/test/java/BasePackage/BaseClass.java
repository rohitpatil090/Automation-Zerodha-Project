package BasePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {

	//browser launching and url inserting is done in base class

	//here Webdriver variable 'driver' declared gloabally outside the launchbrowser() method and public so we can access it across any package
	public static WebDriver driver;        


	//like driver variable launchbrowser() method also made public to access it across whole project in any package
	//launchBrowser() made static bcaz we can call it in another class in staic method by classname referance like classname.methodname() in any class across any package as it is public


	public static void launchBrowser(){


		
			System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
			driver=new ChromeDriver();
		

		



		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://kite.zerodha.com/");
	}

}

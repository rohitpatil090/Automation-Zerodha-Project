package TestPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import BasePackage.BaseClass;
import Kite_pom.AddingStockToWatchlist;
import Kite_pom.Dashboard_Tab;
import Kite_pom.Dashboard_Tab_validations_order;
import Kite_pom.Holdings_Tab;
import Kite_pom.KiteLogin;
import Kite_pom.KiteLogin_2FA;

import UtilityPackage.UtilityClass;

//performed inheritance here by importing all the properties from BaseClass & imp---check the scope of classes always while importing from another class in another package 
public class TestClass_final extends BaseClass {
	
		KiteLogin login;            //variable of KiteLogin pom class declared gloabally so we can use it anywhere in class
		KiteLogin_2FA login_2FA;	//so for all pom class variable is declared globally
		AddingStockToWatchlist addScript;
		Dashboard_Tab_validations_order orders_tab;
		Dashboard_Tab dashboard_tab;
		Holdings_Tab holdings_tab;
		UtilityClass utilclass;
		
		
		@BeforeClass
		
		
		public void browserLaunch() throws InterruptedException, EncryptedDocumentException, IOException {
			//for cross browser value of browser comes from test suite to test class then to Base Class and then there it will compare browser values
			
			BaseClass.launchBrowser();        			//launching of browser and inserting URl is done in @BeforeClass annotation
			login=new KiteLogin(driver);      			//object of KiteLogin pom class is created for calling the methods of KiteLogin pom class
			login_2FA=new KiteLogin_2FA(driver);		//so for all pom classes create object to call the methods from respective class				
			addScript=new AddingStockToWatchlist(driver);
			orders_tab=new Dashboard_Tab_validations_order(driver);
			dashboard_tab=new Dashboard_Tab(driver);
			holdings_tab=new Holdings_Tab(driver);
			utilclass=new UtilityClass();
			
		//vimp--always check argument 'driver' in constructor of pom class ,in pom class and in Baseclass 
			//here Login operation is pre-requisite to execute further tests/testcases
			
			//now calling method/actions from pom class
			//1. Login Process
			login.enterUserID(utilclass.fetchData(1,0));
			login.enterPassword(utilclass.fetchData(1,1));
			login.clickOnLoginButton();
			
			//2.  2FA process
			login_2FA.moveTO2FAPin(driver);
			login_2FA.enter2FAPin(utilclass.get2FA_pin(1, 0));
			login_2FA.clickOnContinueButton();
			
		}

		@BeforeMethod
		public void login() throws InterruptedException {
			//In @BeforeMethod we always use Pre-requisites like test data for tests
			
			
		}
		
		
		@Test
		public void AddingCommodityStockToWatchlist() throws InterruptedException, EncryptedDocumentException, IOException {
			addScript.clickOnCommodityWatchlist();
			addScript.clickOnAddInstrumentSearchBox(utilclass.addScriptToWatchlist(1, 0));
			addScript.AddScriptToWatchlist();
			Thread.sleep(2000);
		}
		
		@Test(groups="Dashboard",priority=1)
		public void ValidatingDashboardTab() throws InterruptedException {
			dashboard_tab.clickOnDashboardTab();
			
			String act_title=driver.getTitle();
			String exp_title="Dashboard / Kite";
			
			Assert.assertEquals(act_title, exp_title, "Title is matched and Dashboard Tab is Validated");
			Thread.sleep(2000);
			
		}
		
		@Test(groups="Dashboard",priority=2)
		public void ValidatingOrdersTab() throws IOException, InterruptedException {
			orders_tab.clickOnOrdersTab();
			orders_tab.clickOnGTTtab();
			orders_tab.clickOnBasketsTab();
			orders_tab.clickOnSIPTab();
			orders_tab.clickOnIPOTab();
			
			
			String act_title=driver.getTitle();
			String exp_title="IPO / Kite";
			
			Assert.assertEquals(act_title, exp_title, "Title is matched and Orders Tab is Validated");
			Thread.sleep(2000);
			
			//UtilityClass.captureScreenShot("20-06-2022-2");
		}
		
		@Test(groups="Dashboard",priority=3)
		public void ValidatingHoldingsTab() throws InterruptedException {
			holdings_tab.clickOnHoldingsTab();
			
			String act_title=driver.getTitle();
			String exp_title="Holdings / Kite";
			
			Assert.assertEquals(act_title, exp_title, "Title is matched and Holdings Tab is Validated");
			
			
		}

		@AfterMethod
		public void aftermethod(ITestResult result) throws IOException, InterruptedException {
			 //@AfterMethod always run after every test or test case so if we want to take screenshot of failed or passed test then we can use scrrenshot code here
			//for this we have to use ItestResult listener 
			//now use condition for failed or passed test case
			
			if(result.getStatus() == ITestResult.FAILURE) {
				//Now call screenshot method from utility class
				UtilityClass.captureScreenShot();
			}
			
			else if(result.getStatus() == ITestResult.SUCCESS){
				UtilityClass.captureScreenShot();
				System.out.println("Success of test cases and its details are : "+result.getName());
			}
			
		
		
		}
		
		
		
		@AfterClass
		public void afterClass() {
			driver.quit();
		}
		
	}



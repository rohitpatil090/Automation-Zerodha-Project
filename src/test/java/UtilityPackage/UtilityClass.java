package UtilityPackage;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import BasePackage.BaseClass;

public class UtilityClass extends BaseClass{

	//utility class is used for repeated methods or code in whole framework like taking screenshot , fetching the data from excel
	//utility class always extends BaseClass


	public static void captureScreenShot() throws IOException, InterruptedException {

		String dateName= new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot ts=(TakesScreenshot)driver;

		//Now call the method .getScreenshotAs(OutputType.FILE) and save that in File datatype as output type is File
		File screenshot_source=ts.getScreenshotAs(OutputType.FILE);

		//now create the the location where you want save that file along with filename datatype
		File screenshot_target=new File("D:\\EL\\JAVA LANG\\Infosys_QA_Env\\src\\test\\java\\ScreenShots_KiteTest\\"+dateName+".png");
		FileHandler.copy(screenshot_source, screenshot_target);
		Thread.sleep(2000);
	} 

	public String fetchData(int row, int cell) throws EncryptedDocumentException, IOException {

		String path="D:\\TESTING\\AUTOMATION\\Login_details.xlsx";          

		FileInputStream file=new FileInputStream(path);				

		String user=WorkbookFactory.create(file).getSheet("login_details").getRow(row).getCell(cell).getStringCellValue();
		return user;

	}

	public String get2FA_pin(int row,int cell) throws EncryptedDocumentException, IOException {
		
		String path="D:\\TESTING\\AUTOMATION\\Login_details.xlsx";          

		FileInputStream file=new FileInputStream(path);				

		String pin=WorkbookFactory.create(file).getSheet("2FA_details").getRow(row).getCell(cell).getStringCellValue();
		return pin;
		
	}

	public String addScriptToWatchlist(int row,int cell) throws EncryptedDocumentException, IOException {
		
		String path="D:\\TESTING\\AUTOMATION\\Login_details.xlsx";          

		FileInputStream file=new FileInputStream(path);				

		String script=WorkbookFactory.create(file).getSheet("Stock_Script").getRow(row).getCell(cell).getStringCellValue();
		return script;
		
	}

}

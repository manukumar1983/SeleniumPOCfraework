package com.seleniumpoc.testcases;




import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.seleniumpoc.utilities.MyException;
import com.seleniumpoc.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	ReadConfig readf=new ReadConfig();
	
	public static WebDriver driver;
	
	
	String app_URL=readf.getAppurl();
	
	//String BrowserType=readf.getBrowsertype();
	
	String uName=readf.getUsername();
	String uPassword=readf.getPassword();
	public static  Logger log;
	@Parameters("Browser")
	@BeforeClass
	public void setUp(String browserType) throws Exception {
     //System.out.println("Before suite is started");		
     log=Logger.getLogger("SeleniumPOC");
//		
	PropertyConfigurator.configure("Log4j.properties");
//		
	  if(browserType.equalsIgnoreCase("chrome")) {
			
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(app_URL);
		Thread.sleep(10000);	

	  }else {
		  throw new MyException("Not valid browser");
	  }
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	public void captureScreenshot(WebDriver driver,String tname) throws Exception {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("D:\\AutomationReport\\"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");
	}
	
	

}

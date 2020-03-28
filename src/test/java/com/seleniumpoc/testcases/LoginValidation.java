package com.seleniumpoc.testcases;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.seleniumpoc.pageobjects.LoginPage;

import junit.framework.Assert;

public class LoginValidation extends BaseClass {
  @Test
  public void loginTest(Method testmethod) throws Exception {
	  Logger log1=log;
	  LoginPage loginPage=new LoginPage(driver,log1);
	  
	  loginPage.login(uName,uPassword);
	  
	  if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
		  Assert.assertTrue(true);
		  log.info("Login test case passed");
	  }else {
		  System.out.println("Test method name is "+testmethod.getName());
		  captureScreenshot(driver, testmethod.getName());
		  Assert.assertTrue(false);
		  log.info("assertinDone");
	  }
	    
	  
	   
	   
	   
	  
  }
 
}

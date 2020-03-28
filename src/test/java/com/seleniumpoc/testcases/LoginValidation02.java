package com.seleniumpoc.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.seleniumpoc.pageobjects.LoginPage;
import com.seleniumpoc.utilities.ExcelUtil;

//import jdk.internal.jline.internal.Log;

public class LoginValidation02 extends BaseClass {
  @Test(dataProvider="testdata")
  public void loginTest(String uName,String pword) throws Exception {
	  Logger log1 = log;
	  LoginPage login=new LoginPage(driver,log1);
	  
	  login.login(uName, pword);
	  
	  if(isAlerpresent()) {
		  log.info("Invalid userName and Password");
		  driver.switchTo().alert().accept();
		  Thread.sleep(2000);
		  driver.switchTo().defaultContent();
	  }else {
		  log.info("valid userName and Password");
		  login.logOut();
		  driver.switchTo().alert().accept();
		  Thread.sleep(2000);
	  }
  }
  
  public boolean isAlerpresent() {
	  try {
		  driver.switchTo().alert();
		  return true;
			  
	  }catch(NoAlertPresentException e) {
		  return false;
	  }
	  
	  	  
  }
  
  @DataProvider(name="testdata")
  String[][] testdata1() throws Exception{
	  String path="D:\\AutomationReport\\testdata.xlsx";
	  int rownum=ExcelUtil.getRowcount(path,"Sheet1");
	  int colcount=ExcelUtil.getCellcount(path, "Sheet1",0);
	  String[][] data=new String[rownum][colcount];
	  for(int i=1;i<rownum;i++) {
		  for(int j=0;j<colcount;j++) {
			  data[i-1][j]=ExcelUtil.getCelldata(path, "Sheet1",i,j);
		  }
	  }
	  
	  return data;
	  
  }
}

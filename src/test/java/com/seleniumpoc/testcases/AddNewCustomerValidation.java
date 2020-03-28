package com.seleniumpoc.testcases;

import org.testng.annotations.Test;

import com.seleniumpoc.pageobjects.AddNewCustomer;
import com.seleniumpoc.pageobjects.LoginPage;

public class AddNewCustomerValidation extends BaseClass {
	
	@Test
	public void addCustomer() throws Exception {
		LoginPage lp=new LoginPage(driver,log);
		log.info("Login page started");
		lp.login("mngr249480","ysUmadU");
		Thread.sleep(50000);
		AddNewCustomer ac=new AddNewCustomer(driver,log);
		ac.ClickNewCustomerLink();
		ac.setName("manu");
	}

}

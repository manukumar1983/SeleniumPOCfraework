package com.seleniumpoc.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.seleniumpoc.utilities.webUtils;

public class LoginPage  {
	WebDriver iDriver;
	@FindBy(name="uid")
	WebElement userField;
	@FindBy(name="password")
	WebElement passwordField;
	@FindBy(name="btnLogin")
	WebElement loginButton;
	@FindBy(xpath = "//a[text()='Log out']")
	WebElement logOut;
	@FindBy(id="closeBtn")
	WebElement closeadWindow;
	Logger log;
	webUtils wUtils;
	public LoginPage(WebDriver driver,Logger log){
		this.iDriver=driver;
		this.log=log;
		PageFactory.initElements(iDriver, this);
		log.info("Page elements intiated");
		wUtils=new webUtils();
	}
	
	public void login(String uName, String pWord) throws Exception {
		Thread.sleep(10000);
		/*iDriver.switchTo().frame();
		Thread.sleep(10000);
		closeadWindow.click();
		iDriver.switchTo().parentFrame();*/
		wUtils.closeFramewindow(iDriver,"flow_close_btn_iframe", closeadWindow);
		userField.sendKeys(uName);
		log.info("Entered value in user field");
		passwordField.sendKeys(pWord);
		log.info("Entered value in passowrd field");
		loginButton.click();
		log.info("clicked button");
	}
	
	public void logOut() {
		logOut.click();
		
	}
	

}

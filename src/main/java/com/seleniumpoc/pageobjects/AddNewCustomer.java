package com.seleniumpoc.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.seleniumpoc.utilities.webUtils;

public class AddNewCustomer {
	
	public WebDriver iDriver;
	Logger log;
	webUtils wUtils;
	public AddNewCustomer(WebDriver driver,Logger log) {
		iDriver=driver;
		this.log=log;
		PageFactory.initElements(iDriver, this);
		wUtils=new webUtils();
	}
	@FindBy(xpath="//a[text()='New Customer']")
	WebElement newCustomerLink;
	@FindBy(name="name")
	WebElement name;
	@FindBy(name="rad1")
	WebElement gender;
	@FindBy(name="dob")
	WebElement dob;
	@FindBy(name="addr")
	WebElement address;
	@FindBy(name="city")
	WebElement city;
	@FindBy(name="state")
	WebElement state;
	@FindBy(name="pinno")
	WebElement pincode;
	@FindBy(name="telephoneno")
	WebElement telephone;
	@FindBy(name="emailid")
	WebElement email;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="sub")
	WebElement submitButton;
	@FindBy(id="closeBtn")
	WebElement closeadWindow;
	
	
	
	public void ClickNewCustomerLink() throws Exception {
		Thread.sleep(10000);
		wUtils.closeFramewindow(iDriver,"flow_close_btn_iframe", closeadWindow);
		newCustomerLink.click();
	}
	public void setName(String name1) {
	name.sendKeys(name1);
	}
	public void setGender(String gendgervalue) {
		gender.click();
	}
	public void setDob(String str1,String str2,String str3) {
		dob.sendKeys(str1);
		dob.sendKeys(str2);
		dob.sendKeys(str2);
	}
	public void setAddress(String address1) {
		address.sendKeys(address1);
	}
	public void setCity(String city1) {
		city.sendKeys(city1);
	}
	public void setState(String state1) {
		state.sendKeys(state1);
	}
	public void setPincode(String pincode1) {
		pincode.sendKeys(pincode1);
	}
	public void setTelephone(String telephone1) {
		telephone.sendKeys(telephone1);
	}
	public void setEmail(String email1) {
		email.sendKeys(email1);
	}
	public void setPassword(String password1) {
		password.sendKeys(password1);
	}
	
	public void submit() {
		submitButton.click();
	}
	
	

}

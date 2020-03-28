package com.seleniumpoc.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class webUtils {
	
	public void closeFramewindow(WebDriver iDriver,String frameID, WebElement closePopup) throws Exception {
		iDriver.switchTo().frame("flow_close_btn_iframe");
		Thread.sleep(1000);
		closePopup.click();
		iDriver.switchTo().parentFrame();
		
	}


}

package com.seleniumpoc.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	 Properties pro;
	
	public ReadConfig() {
		System.out.println("Read Config is started");
		FileInputStream fis;
		try {
			fis = new FileInputStream(new File("./Configuration/config.properties"));
			    pro=new Properties();
				pro.load(fis);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		 
		
	}
	
	public String getAppurl() {
		String url=pro.getProperty("app_URL");
		return url;
	}
	
	public String getUsername() {
		String uName=pro.getProperty("uName");
		return uName;
	}
	
	public String getPassword() {
		String pWord=pro.getProperty("uPassword");
		return pWord;
	}
	
	public String getBrowsertype() {
		String btype=pro.getProperty("BrowserType");
		return btype;
	}

}

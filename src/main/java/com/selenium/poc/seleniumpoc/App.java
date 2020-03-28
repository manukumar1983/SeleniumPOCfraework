package com.selenium.poc.seleniumpoc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 


{
	App3 ap=new App3();
	
	public App() {
		System.out.println(ap.x);
	}
	
   /* public static void main( String[] args ) throws Exception
    {
        
    	WebDriverManager.chromedriver().setup();

    	WebDriver driver=new ChromeDriver();
    	
    	driver.get("http://google.com");
    	Thread.sleep(5000);
     	driver.findElement(By.name("q")).sendKeys("manu");
    }*/
}

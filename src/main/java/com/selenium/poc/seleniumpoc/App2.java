package com.selenium.poc.seleniumpoc;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class App2 extends App {
	
	int x=1;
	
	static {
		System.out.println("static App2");
	}
	public App2() {
		
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		
        Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());
        
        System.out.println(timestamp);

	}

}

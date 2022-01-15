package com.meetpractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice3 {

	public void m1() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/");
		driver.get("https://www.facebook.com/");
		driver.get("https://www.instagram.com/accounts/login/");
		driver.get("https://accounts.google.com/");
		//driver.quit();
		driver.close();
		
	}

	public static void main(String[] args) {
		new SeleniumPractice3().m1();
	}
}

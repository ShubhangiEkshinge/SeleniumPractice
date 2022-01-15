package com.practice.browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public void method() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
	}

	public static void main(String[] args) {
		new ChromeBrowser().method();
	}

}

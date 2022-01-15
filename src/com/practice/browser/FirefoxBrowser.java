package com.practice.browser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
	public void method1() {
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\JARs\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.instangram.com");

	}

	public static void main(String[] args) {
		new FirefoxBrowser().method1();
	}

}

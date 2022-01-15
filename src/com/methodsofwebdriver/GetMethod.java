package com.methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
	public void TestCase() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.testingshastra.com"); // Using get() method of webDriver(I) It's open currently pointed
														// windows
	}

	public static void main(String[] args) {
		new GetMethod().TestCase();
	}

}

package com.methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrenturlMethod {

	public void TestCase2() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.testingshastra.com");
		String CurrentURL = driver.getCurrentUrl();
		System.out.println("currently open url" + CurrentURL); // Using GetCurrentUrl() method of WebDriver(I) It's
																// return currently open page url
	}

	public static void main(String[] args) {
		new GetCurrenturlMethod().TestCase2();
	}

}

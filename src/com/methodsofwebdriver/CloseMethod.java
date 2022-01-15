package com.methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {
	public void TestCase3() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.testingshastra.com");
		driver.close();// Using Close() method of WebDriver(I) It's close the currently pointed
						// windows(webdriver itself open the windows-only that window close)
	}

	public static void main(String[] args) {
		new CloseMethod().TestCase3();
	}

}

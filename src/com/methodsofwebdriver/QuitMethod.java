package com.methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
	public void TestCase4() {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\JARs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.testingshastra.com");
		driver.get("http://www.myntra.com");
		driver.get("http://www.amezon.com");
		driver.quit();// Using quit() method of WebDriver(I) It's close the all windows that open in
						// webdriver itself
	}

	public static void main(String[] args) {
		new QuitMethod().TestCase4();
	}

}

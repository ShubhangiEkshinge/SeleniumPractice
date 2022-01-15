package com.methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPagesourceMethod {

	public void TestCase1() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.testingshastra.com");
		String PageSource = driver.getPageSource();// Using getPageSource() method of webDriver(I) It's return the souce
													// code of currently pointed page in windows
		System.out.println(PageSource);
	}

	public static void main(String[] args) {
		new GetPagesourceMethod().TestCase1();
	}

}

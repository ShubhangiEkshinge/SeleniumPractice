package com.methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public void TestCase3() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.testingshastra.com");
		String Title = driver.getTitle();
		System.out.println("Current Title:" + Title); // Using GetTitle() method of WebDriver(I) It's return the Title
														// of current pointed page(HTML Page)
	}

	public static void main(String[] args) {
		new GetTitleMethod().TestCase3();
	}

}

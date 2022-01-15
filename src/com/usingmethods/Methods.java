package com.usingmethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public void Testcase_01() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver94.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.get("https://www.testingshastra.com");
//		String url = driver.getCurrentUrl();
//		System.out.println("current url is:"+url);
//		String pageSource =driver.getPageSource();
//		System.out.println("Page Source is :"+pageSource);
//		String Title =driver.getTitle();
//		System.out.println("Title is:"+Title);
//		driver.close();
		driver.quit();
		
	}

	public static void main(String[] args) {
		new Methods().Testcase_01();
	}
}

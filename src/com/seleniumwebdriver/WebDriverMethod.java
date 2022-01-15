package com.seleniumwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

	public void testCase_01() {
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/JARs/chromedriver94.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shutterfly.com/");// open the currently pointed window(that driver instance pointed)ed
//		String pageSource = driver.getPageSource();
//		System.out.println("current PageSource is:" + pageSource); //It's returns the page source code (return type is String)
//	     String Title = driver.getTitle();
//	     System.out.println("Current Title is:"+Title);//It's returns the Title of HTML that currently pointed in window(return type is string)
//	    String currentUrl  = driver.getCurrentUrl();
//	    System.out.println("Current url is:"+currentUrl);//It's returns the Currently pointed window's url(return type is String)
//	    driver.close();//It's close the single window that currently pointed through driver instance(return type is void)
		driver.close();
	}

	public static void main(String[] args) {
		new WebDriverMethod().testCase_01();
	}
}

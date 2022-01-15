package com.meetwithbhushan;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_WebDriverMethods {
		public void Case() {
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://testingshastra.com/");
//			String pagesource = driver.getPageSource();
//			System.out.println("pagesource" + pagesource);
//			String url = driver.getCurrentUrl();
//			System.out.println("Current Url" + url);
//			String title = driver.getTitle();
//			System.out.println("current Title:"+title);
			driver.close();
		}

	public static void main(String[] args) {
		new Using_WebDriverMethods().Case();
	}

}

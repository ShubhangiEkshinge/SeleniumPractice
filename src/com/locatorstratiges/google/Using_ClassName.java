package com.locatorstratiges.google;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_ClassName {
	public void TestCase() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// driver.get("https://www.google.com/");
		// driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).click();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.xpath("")).click();
	}

	public static void main(String[] args) {
		new Using_ClassName().TestCase();
	}

}

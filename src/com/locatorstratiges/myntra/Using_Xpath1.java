package com.locatorstratiges.myntra;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Using_Xpath1 {

	public void shubhangiAgni() {
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\JARs\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//div[@class=\"desktop-navLink\"]/a[@href=\"/shop/women\"]")).click();
	}

	public static void main(String[] args) {
		new Using_Xpath1().shubhangiAgni();
	}

}

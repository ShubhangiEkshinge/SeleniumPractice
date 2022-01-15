package com.locatorstratiges.shutterfly;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Locator1 {
	public void testCase() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shutterfly.com/prints/");
		driver.findElement(By.xpath("//span[contains(text(),'Holiday')]/parent::a")).click();
	}

	public static void main(String[] args) {
		new Using_Locator1().testCase();
	}
}
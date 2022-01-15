package com.locatorstratiges.myntra;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Xpath4 {
	public void TestCase() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//div[@data-reactid=\"19\"]")).click();
	}

	public static void main(String[] args) {
		new Using_Xpath4().TestCase();
	}
}

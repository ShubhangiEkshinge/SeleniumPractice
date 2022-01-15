package com.locatorstratiges.myntra;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Xpath3 {
	public void TestCase() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//div[@class=\"desktop-navLink\"]/a[@href=\"/personal-care\"]")).click();
	}

	public static void main(String[] args) {
		new Using_Xpath3().TestCase();
	}

}

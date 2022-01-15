package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfByClass {

	public void test_Cases() {
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/JARs/chromedriver94.exe");
		// System class is not instantiated
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		WebElement element = driver.findElement(By.xpath("//div[@class=\"_3qX0zy\"]/child::a"));
//		element.click();
//		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Staples')]"));
//		element.click();

		driver.get("https://www.myntra.com/");
		// a[contains(text(),'Men')]/parent::div/child::a or
		// //div[@class="desktop-navLink"]/child::a[contains(text(),'Men')]
		WebElement element = driver
				.findElement(By.xpath("//div[@class=\"desktop-navLink\"]/child::a[contains(text(),'Men')]"));
		element.click();
		driver.close();
	}

	public static void main(String[] args) {
		new MethodsOfByClass().test_Cases();

	}
}
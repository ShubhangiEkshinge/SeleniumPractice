package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClass_Method {

	public void testCase() {
		// System class is not instantiated
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/JARs/chromedriver94.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		// Using className() method,It's return as an String(take arguments as an instance of By class)
//		WebElement element = driver.findElement(By.className("//span[@class=\"hm-icon-label\"]"));
//		element.click();
//		WebElement element = driver.findElement(By.xpath("//script[@type=\"text/javascript\"]/preceding-sibling::a[contains(text(),'Mobiles')]"));
//	    element.click();
//		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]/following-sibling::a[contains(text(),'Best Sellers')]"));
//		element.click();
//		WebElement element = driver.findElement(By.xpath("//div[@class=\"nav-progressive-content\"]/child::a[3]"));
//		element.click();
//		WebElement element = driver.findElement(By.xpath("//div[@class=\"nav-progressive-content\"]/child::a[4]"));
//		element.click();
		try {
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Prime')]/following-sibling::span"));
		element.click();
		}catch(Exception e) {
		System.out.println("exception handled");
		}
	    driver.close();
	}

	public static void main(String[] args) {
		new ByClass_Method().testCase();
	}
}

package com.meetwithbhushan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_ID {
	public void Case() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/");
		By by = By.id("registerModalBtn");
		WebElement webelement = driver.findElement(by);
		webelement.click();

	}

	public static void main(String[] args) {
		new Using_ID().Case();
	}
}

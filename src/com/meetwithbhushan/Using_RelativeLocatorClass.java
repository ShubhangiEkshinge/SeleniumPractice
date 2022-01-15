package com.meetwithbhushan;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_RelativeLocatorClass {

	public void testCase01() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/");
		driver.findElement(By.xpath("")).click();
	}

	public static void main(String[] args) {
		new Using_RelativeLocatorClass().testCase01();

	}

}

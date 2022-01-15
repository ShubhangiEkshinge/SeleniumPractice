package com.meetwithbhushan;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Xpathdemo {
	public void TestCase() {
//		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\JARs\\geckodriver.exe");
//		FirefoxDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/");
		driver.findElement(By.xpath("//a[@href=\"/recent-placements\"]")).click();
	}

	public static void main(String[] args) {
		new Using_Xpathdemo().TestCase();

	}
}

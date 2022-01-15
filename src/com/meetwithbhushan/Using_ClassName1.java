package com.meetwithbhushan;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_ClassName1 {
	public void Case() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/");
//		By by = By.className("sf-with-ul");
//		WebElement webelement =driver.findElement(by);
//		webelement.click();
//		driver.findElement(By.linkText("NOTES")).click();
		driver.findElement(By.partialLinkText("Assignments")).click();
	}

	public static void main(String[] args) {
		new Using_ClassName1().Case();
	}

}

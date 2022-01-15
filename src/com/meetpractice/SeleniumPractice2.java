package com.meetpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice2 {
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://testingshastra.com");
//		driver.findElement(By.xpath("//a[contains(text(),\"Courses\")]")).click();
//		System.out.println("execution");
		driver.get("https://demoqa.com/");
		
	}

	public static void main(String[] args) {
		new SeleniumPractice2().m1();
	}

}

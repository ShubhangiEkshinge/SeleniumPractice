package com.practice.framehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public void handlingFrame() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver94.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2017/");
//		driver.switchTo().frame("google").switchTo().frame("google_esf");
//		String attributeIs =driver.findElement(By.tagName("iframe")).getAttribute("style");
//		System.out.println(attributeIs);//o/p is display

		driver.switchTo().frame("google");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("google_esf");
		String attributeIs = driver.findElement(By.tagName("iframe")).getAttribute("style");
		System.out.println(attributeIs);
	}

	public static void main(String[] args) {
		new HandlingFrame().handlingFrame();
	}
}
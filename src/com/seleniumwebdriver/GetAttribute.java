package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	
	public void testCase_01() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver94.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ijmeet.com/");

//		String value =driver.findElement(By.xpath("//a[contains(text(),' Join Meeting ')]")).getAttribute("contains");
//	    System.out.println("value of attribute is:"+value);
		}

	public static void main(String[] args) {
		new GetAttribute().testCase_01();
	}

}

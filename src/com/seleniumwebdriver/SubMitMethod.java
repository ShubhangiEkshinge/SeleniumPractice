package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubMitMethod {

	public void test_Case() {
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/JARs/chromedriver94.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://inurture.co.in/nagindas2021/");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).submit();
		
//		driver.get("https://inurture.co.in/nagindas2021/");
//		 driver.findElement(By.xpath("//small[contains(text(),'Name is required')]/preceding-sibling::input")).clear();
//	    driver.get("https://ijmeet.com/");
//	    WebElement element =driver.findElement(By.xpath("//a[contains(text(),' Join Meeting ')]"));
//	    //& return type of findElement() is WebElement so we can't be mistmatch
//	    System.out.println("TagName is:"+element.getTagName());//return type of gettagName() is String
	    //OR
//	      String tagName = element.getTagName();
//	      System.out.println("tagName is:"+tagName);
	}

	public static void main(String[] args) {
		new SubMitMethod().test_Case();
	}

}

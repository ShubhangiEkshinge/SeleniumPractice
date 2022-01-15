package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {

	public void testCase_01() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver94.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ijmeet.com/");
		String tagName =driver.findElement(By.xpath("//a[contains(text(),'Join Meeting ')]")).getTagName();
		System.out.println("tagName is:"+tagName);
	}
		
//		driver.get("https://ijmeet.com/login");
//		String attribute = driver.findElement(By.xpath("//a[@class=\"social-login-button social-login-button-google\"]")).getAttribute("attribute");
//		System.out.println("attribute is:" + attribute);//It returns null
//	    WebElement element =driver.findElement(By.xpath("//*[@id=\"host_meeting\"]/a"));
//	    element.click();

	public static void main(String[] args) {
		new GetTagName().testCase_01();
	}

}

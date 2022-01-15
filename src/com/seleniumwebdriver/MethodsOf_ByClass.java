package com.seleniumwebdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOf_ByClass {

	public void testCase() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver94.exe");
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.shutterfly.com/");
//		 By by =By.xpath("//span[contains(text(),'Holiday')]");
//		 WebElement webElement = driver.findElement(by);
//		 webElement.click();
		// OR
//		WebElement webElement = driver.findElement(By.xpath("//span[contains(text(),'Holiday')]"));
//	    webElement.click();

//		WebElement webElement1 =driver.findElement(By.xpath("//span[contains(text(),\"Photo Books\")]/parent::a[@role=\"link\"]/child::span"));
//		 webElement1.click();//It's the  method of webElement(I),Return type is void
		// OR
//		WebElement element = driver.findElement(By.xpath("//a[@role=\"link\"]/child::span[contains(text(),'Photo Books')]"));
//	     element.click();

//		WebElement element =driver.findElement(By.xpath("//a[@role=\"link\"]/child::span[contains(text(),'Cards & Stationery')]"));
//		element.click();
//		WebElement element = driver.findElement(By.xpath("//a[@role='link']/child::span[contains(text(),'Prints')]"));
//		element.click();
//		WebElement element = driver.findElement(By.xpath("//a[@role=\"link\"]/child::span[contains(text(),'Gifts')]"));
//		element.click();
//		WebElement element = driver.findElement(By.xpath("//a[@role=\"link\"]/child::span[contains(text(),'Wall Art')]"));
//		element.click();
//		WebElement element = driver.findElement(By.xpath("//a[@role=\"link\"]/child::span[contains(text(),'Home Decor')]"));
//		element.click();
//		WebElement element = driver.findElement(By.xpath("//a[@role=\"link\"]/child::span[contains(text(),'Wedding')]"));
//		element.click();
		
		driver.manage().window().maximize(); 
		driver.get("https://www.shutterfly.com/");
		
		driver.findElement(By.xpath("//a[@role='link']/span[contains(text(),'Calendars')]")).click();
	    
		driver.findElement(By.xpath("//a[@role='link']/child::span[contains(text(),'Occasions')]")).click();
		
		driver.findElement(By.xpath("//a[@role='link']/child::span[contains(text(),'Deals')]")).click();
	  
		driver.findElement(By.xpath("//a[@role='link']/child::span[contains(text(),'Ideas')]")).click();
	
	}
	public static void main(String[] args) {
		new MethodsOf_ByClass().testCase();
	}

}

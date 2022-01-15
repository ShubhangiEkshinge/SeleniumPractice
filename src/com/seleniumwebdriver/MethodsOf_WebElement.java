package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOf_WebElement {

	public void test_Cases() {
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/JARs/chromedriver94.exe");
		// System class is not instantiated
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ijmeet.com/");
//		driver.findElement(By.xpath(" //a[contains(text(),' Sign In ')]")).click();
		
		//Using submit() but not working
//		driver.get("http://admissions2021.amity.edu/");
//		driver.findElement(By.xpath("//button[@id=\"form-submit-button\"]")).submit();
		
		//Using Click() 
//		driver.get("https://www.ashlandonlinemba.com/");
//		driver.findElement(By.xpath("//*[@id=\"form_7552c322-b98a-4759-b9d4-278461d2de36_container\"]/div[4]/button")).click();
		
		//Using Submit()
//		driver.get("https://ijmeet.com/login?");
//		driver.findElement(By.id("email")).submit();
		
		//Using isSelected()-using for only checkBox & radio buttons,It's returns boolean
//		boolean isselected =driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).isSelected();
//		System.out.println("isselected is:"+isselected);//It's return false because chechBox is not checked
	    
		//isDispalyed()
//		boolean elementVisible =driver.findElement(By.xpath("//a[contains(text(),' Contact sales ')]")).isDisplayed();
//	    System.out.println("Is elementVisible:"+elementVisible);//o/p is true because element is visible
	     
		//getText()- It's return the text of WebElement
//		String text = driver.findElement(By.xpath("//a[contains(text(),' Sign In ')]")).getText();
//	    System.out.println("getText is:"+text);
	    //if does'nt have the test to webElement the return the empty String
		driver.findElement(By.xpath("//a[contains(text(),' Sign In ')]")).click();
//		String text =driver.findElement(By.id("//input[@id=\"email\"]")).getText();
//		System.out.println("get text is:"+text);
	}
	public static void main(String[] args) {
		new MethodsOf_WebElement().test_Cases();
	}
}

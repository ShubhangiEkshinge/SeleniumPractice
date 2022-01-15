package com.practice.toolsqasite;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pra_Elements {

	public void testCase() {
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/JARs/chromedriver94.exe");
		ChromeDriver driver = new ChromeDriver();

		// TextBox
//	      driver.get("https://demoqa.com/text-box");
//	      driver.findElement(By.xpath("//input[@placeholder=\"Full Name\"]")).sendKeys("Shubhangi Ekshinge" , Keys.ENTER);
//	      driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("shubhangiekshinge05@gmail.com" ,Keys.ENTER);
//	      driver.findElement(By.xpath("//textarea[@id=\"currentAddress\"]")).sendKeys("Kothrud,Pune",Keys.ENTER);
//          driver.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]")).sendKeys("Jalna",Keys.ENTER);
//		  driver.findElement(By.xpath("//button[@id=\"submit\"]")).submit();

		// CheckBox
//		driver.get("https://demoqa.com/checkbox");
//		boolean isSelected = driver.findElement(By.xpath("//span[@class=\"rct-checkbox\"]")).isSelected();
//		System.out.println("isSelected :" + isSelected);//o/p is false

		 //radio Button
		driver.get("https://demoqa.com/radio-button");
		boolean isselected = driver.findElement(By.xpath("//label[@for=\"impressiveRadio\"]")).isSelected();
		System.out.println("isselected:" + isselected);//o/p is false

	}

	public static void main(String[] args) {
		new Pra_Elements().testCase();
	}

}
package com.practice.waitsdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.practice.toolsqasite.Pra_Elements;

public class UsingWait {

	public void testCase() {
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/JARs/chromedriver94.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		 
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//button[@class=\"btn btn-success\"]")).click();
		
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//button[@id=\"populate-text\"]")).click();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//button[@id=\"display-other-button\"]")).click();
		
		//Using Explicit wait
		// FluentWait wait = new FluentWait(driver);
		// wait.pollingEvery(Duration.ofSeconds(10));
		
		//Using Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@id=\"enable-button\"]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Button')]")).click();
		
	}

	public static void main(String[] args) {
		new UsingWait().testCase();
	}

}

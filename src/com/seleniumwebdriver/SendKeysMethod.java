package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public void testCase() {
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/JARs/chromedriver94.exe");
		ChromeDriver driver = new ChromeDriver();
		// driver.get("https://accounts.google.com/");
//		WebElement element = driver.findElement(By.xpath("//input[@type=\"email\"]"));
		// element.sendKeys("shubhsngiekshinge05@gmail.com");
		// element.sendKeys("sekshinge97@gmail.com",Keys.ENTER);
//		driver.get("https://support.google.com/mail/answer/56256?hl=en");
//		WebElement element = driver.findElement(By.xpath("//a[@class=\"action-button\"]"));
//		element.click();
//		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
//		WebElement element1 = driver.findElement(By.xpath("//input[@name=\"firstName\"]"));
//		element1.sendKeys("Shubhangi", Keys.ENTER);
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement element1 = driver.findElement(By.xpath("//input[@name=\"lastName\"]"));
		element1.sendKeys("Ekshinge", Keys.ENTER);
		//Below it's not working
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("id=\"email\"")).sendKeys("shubhangiekshinge05@gmail.com");
//		driver.findElement(By.id("id=\"pass\"")).sendKeys("Sita@1976");
//		driver.findElement(By.id("id=\"pass\"")).submit();

	}

	public static void main(String[] args) {
		new SendKeysMethod().testCase();
	}
}

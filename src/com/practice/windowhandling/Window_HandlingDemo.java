package com.practice.windowhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_HandlingDemo {

	public void handlingMultipleWindow() {
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/JARs/chromedriver96.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//button[contains(text(),'click')])[1]")).click();
        
	}

	public static void main(String[] args) {
		new Window_HandlingDemo().handlingMultipleWindow();
	}

}

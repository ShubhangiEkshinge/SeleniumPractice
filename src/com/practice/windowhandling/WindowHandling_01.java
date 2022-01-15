package com.practice.windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling_01 {

	public void handlingWindow() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver94.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();
		String currentWindow = driver.getWindowHandle();
		Set<String> allWindows =driver.getWindowHandles();
		for(String window:allWindows){
			if(window.equals(currentWindow)) {
			
			}else {
				driver.switchTo().window(currentWindow);
				break;
			}
		}
		
		WebElement text =driver.findElement(By.id("sampleHeading"));
		System.out.println("Current locators text:"+text.getText());
	}

	public static void main(String[] args) {
		new WindowHandling_01().handlingWindow();
	}
}

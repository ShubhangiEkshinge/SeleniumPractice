package com.practice.framehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling_01 {

	public void handlingFrame() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver94.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		//first frame
		driver.switchTo().frame("frame1");
		WebElement elements = driver.findElement(By.id("sampleHeading"));
		System.out.println(elements.getText());//o/p is-This is a sample page
		
		//second frame
//		driver.switchTo().frame("frame2");
//		WebElement element = driver.findElement(By.id("sampleHeading"));
//		String text =element.getText();
//		System.out.println(text);
		
		
	}

	public static void main(String[] args) {
		new FrameHandling_01().handlingFrame();
	}
}
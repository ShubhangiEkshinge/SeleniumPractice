package com.practice.framehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling_02 {

	public void handlingFrame() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver94.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		// switch to first window
		driver.switchTo().frame("frame1");
		WebElement frame1 = driver.findElement(By.id("sampleHeading"));
		System.out.println("first frame message:"+frame1.getText());
		
		driver.switchTo().defaultContent();// driver instance focused on parent dom
		// we does't switch to frame1 from switch frame2
		// (parent dom---Frame1--parent dom(using defaultContext()method)--Frame2)
		
		// after switch to frame2
		driver.switchTo().frame("frame2");
		WebElement frame2 = driver.findElement(By.id("sampleHeading"));
		System.out.println("second frame message:"+frame2.getText());
	}

	public static void main(String[] args) {
		new FrameHandling_02().handlingFrame();
	}
}

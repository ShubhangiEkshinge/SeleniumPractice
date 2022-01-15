package com.practice.framehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameHandling {

	public void handlingFrame() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver94.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		// switch to first frame
//		driver.switchTo().frame("frame1");//first frame
//		driver.switchTo().frame("frame1");//inside frame

		// OR
		// when frame inside the frame(nested frame)
		driver.switchTo().frame("frame1").switchTo().frame(0);
		String dispalyText = driver.findElement(By.tagName("p")).getText();
		System.out.println(dispalyText);// o/p is-Child Iframe

		// here we to switch child frame to parent frame
		driver.switchTo().parentFrame();// when we want to swich to parent Frame
		System.out.println(driver.getPageSource());//Only print iframe contents
		driver.close();
	}

	public static void main(String[] args) {
		new NestedFrameHandling().handlingFrame();
	}
}

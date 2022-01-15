package com.meetwithbhushan;

import org.openqa.selenium.chrome.ChromeDriver;

public class Using_XPath {
	
	public void Case() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/");
		//driver.findElement(By.xpath(""))
}
	public static void main(String[] args) {
		//new Using_Xpath().Case();
	}


}

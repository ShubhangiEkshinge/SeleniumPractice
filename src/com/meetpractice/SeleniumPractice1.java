package com.meetpractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice1 {

	public void m1() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com");
		driver.navigate().to(
				"https://www.myntra.com/?utm_source=perf_bing_traffic&utm_medium=perf_bing_traffic&utm_campaign=Bing_Brand_BMM_Desktop&utm_source=bing");
//		String srg = driver.getPageSource();
//		System.out.println("PageSource"+srg);
//		String srg = driver.getCurrentUrl();
//		System.out.println("current url"+srg);
//		String srg = driver.getTitle();
//		System.out.println("Title"+srg);
		// String srg = driver.getPageSource();
		// driver.close();
//		System.out.println("PageSource"+srg);
//		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().forward();

	}

	public static void main(String[] args) {
		new SeleniumPractice1().m1();
	}
}

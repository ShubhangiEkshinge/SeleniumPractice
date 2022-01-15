package com.practice.browser;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {

	private void method3() {
		System.setProperty("webdriver.edge.driver", "D:\\Drivers\\JARs\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://www.twitter.com");
	}

	public static void main(String[] args) {
		new EdgeBrowser().method3();

	}

}

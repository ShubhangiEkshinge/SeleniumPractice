package com.seleniumwebdriver;

import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

//import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {

	public void testCase() {
//      System.setProperty("webdriver.chrome.driver","D:\\Drivers\\JARs\\chromedriver94.exe");
//	  ChromeDriver driver = new ChromeDriver();
//	  driver.get("https://www.shutterfly.com/");
//	}
//		System.setProperty("webdriver.gecko.driver","D:\\Drivers\\JARs\\geckodriver.exe");
//		 FirefoxDriver driver = new FirefoxDriver();
//		 driver.get("https://www.shutterfly.com/");
//	}
//		System.setProperty("webdriver.ie.driver","D:\\Drivers\\JARs\\IEDriverServer.exe");
//		InternetExplorerDriver driver = new InternetExplorerDriver();
//		 driver.get("https://www.shutterfly.com/");
//	}

		System.setProperty("webdriver.edge.driver", "D:/Drivers/JARs/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.shutterfly.com/");
	}

	public static void main(String[] args) {
		new Launch_Browser().testCase();
	}

}

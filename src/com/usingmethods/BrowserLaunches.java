package com.usingmethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunches {

	public void methods() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\JARs\\chromedriver94.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ijmeet.com/");
		driver.close();
	}

	public void methods1() {
		System.setProperty("webdriver.edge.driver", "D:\\Drivers\\JARs\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://github.com/");
		driver.close();
	}

	public void methods2() {
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\JARs\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.close();
	}

	public void methods3() {
		System.setProperty("webdriver.ie.driver", "D:\\Drivers\\JARs\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("https://mvnrepository.com/");
		driver.close();
	}

	public static void main(String[] args) {
		new BrowserLaunches().methods();
		new BrowserLaunches().methods1();
		new BrowserLaunches().methods2();
		new BrowserLaunches().methods3();
	}

}

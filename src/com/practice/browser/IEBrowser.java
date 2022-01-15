package com.practice.browser;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {
	private void method2() {
		System.setProperty("webdriver.ie.driver", "D:\\Drivers\\JARs\\IEDriverServer.exe");
		InternetExplorerDriver name = new InternetExplorerDriver();
	}

	public static void main(String[] args) {
		new IEBrowser().method2();
	}

}

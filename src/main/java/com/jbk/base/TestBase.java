package com.jbk.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public static Logger log = Logger.getLogger(TestBase.class);
		
	public WebDriver initialization () {
			
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		log.info("Initialization browser");
		driver = new ChromeDriver();
		log.info("Chrome browser opened");
		driver.manage().window().maximize();
		driver.get("file:///D:/Posts12/Java%20By%20Kiran/Installers/Offline%20website/index.html");
		log.info("JBK Offline application launched");
		return driver;
	}

}

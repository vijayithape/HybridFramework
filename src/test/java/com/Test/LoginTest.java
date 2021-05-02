package com.Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jbk.Pages.LoginPage;
import com.jbk.base.TestBase;

public class LoginTest extends TestBase{
	WebDriver driver;
	
	LoginPage lp = null;
	
	@Test
	public void loginTest () {
		driver=initialization();
		lp = new LoginPage(driver);
		lp.enterUserName("kiran@gmail.com");
		lp.enterPassword("123456");
		lp.clickLoginButton();
		log.info("User is successfully loged in");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		}
	

}

package com.jbk.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	/**
	/Methods
	*/
	public void enterUserName(String text) {
		username.sendKeys(text);
	}
	
	public void enterPassword(String text) {
		password.sendKeys(text);
	}
	public void clickLoginButton() {
		loginbtn.click();
	}

}

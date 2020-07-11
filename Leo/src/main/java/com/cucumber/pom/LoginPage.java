package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//span[text()='Hello. Sign in']")
	private WebElement signin;
	
	@FindBy(xpath = "//div[text()='Add account']")
	private WebElement addaccount;
	
	@FindBy(id = "ap_email")
	private WebElement emailaddress;
	
	@FindBy(id = "continue")
	private WebElement buttoncontinue;
	
	@FindBy(id = "ap_password")
	private WebElement password;
	
	@FindBy(id = "signInSubmit")
	private WebElement loginbutton;

	public WebElement getButtoncontinue() {
		return buttoncontinue;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getAddaccount() {
		return addaccount;
	}

	public WebElement getEmailaddress() {
		return emailaddress;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	public LoginPage(WebDriver xdriver) {
		
		this.driver = xdriver;
		
		PageFactory.initElements(driver, this);
	}
}

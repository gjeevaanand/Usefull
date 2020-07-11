package com.cucumber.stepdefinition;

import com.cucumber.baseclass.BaseClass;
import com.cucumber.pom.LoginPage;

import cucumber.api.java.en.Then;

public class StepDefinition extends BaseClass {


@Then("^customer enter the url$")
public void customer_enter_the_url() throws Throwable {
	getUrl("https://www.amazon.in/");
	
}

@Then("^customer click the sign in button$")
public void customer_click_the_sign_in_button() throws Throwable {
	LoginPage lp = new LoginPage(driver);
	clickElement(lp.getSignin());
	
}

@Then("^customer enter the username$")
public void customer_enter_the_username() throws Throwable {
	LoginPage lp = new LoginPage(driver);
	clickElement(lp.getAddaccount());
	sendKeys(lp.getEmailaddress(), "joshsilver4uever@gmail.com");
	clickElement(lp.getButtoncontinue());
	
}

@Then("^customer enter the password$")
public void customer_enter_the_password() throws Throwable {
	
	LoginPage lp = new LoginPage(driver);
	sendKeys(lp.getPassword(), "Appa@1956");
	
}
@Then("^customer click the login in button$")
public void customer_click_the_login_in_button() throws Throwable {
	LoginPage lp = new LoginPage(driver);
	clickElement(lp.getLoginbutton());

}

}

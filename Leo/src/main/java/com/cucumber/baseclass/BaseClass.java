package com.cucumber.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
public static WebDriver driver;
	
	public static void browserLaunch() {
	
		try {
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\JEEVA29ANAND\\eclipse-workspace\\Leo\\river\\chromedriver.exe");
			driver = new ChromeDriver();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void getUrl(String url) {
		
		try {
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void clickElement(WebElement element) {
		
		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void sendKeys(WebElement element, String Value) {
		
		try {
			element.sendKeys(Value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}

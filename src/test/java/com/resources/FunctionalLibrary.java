package com.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class FunctionalLibrary {
	public static WebDriver driver;
	public static void launch(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anitha\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);

	

	}

	public static void type(WebElement ele,String value) {
		ele.sendKeys(value);

	}
	public static void button(WebElement ele) {
		ele.click();

	}

}

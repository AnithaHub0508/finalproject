package com.main.in;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class Customerdetails {
	
	static WebDriver driver;
	
	@Given("User should be in home page")
	public void user_should_be_in_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anitha\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	   driver.get("http://demo.guru99.com/telecom");
	    
	}

	@Given("User click on add customer page")
	public void user_click_on_add_customer_page() {
	    driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("User enter all valid details in the field")
	public void user_enter_all_valid_details_in_the_field() {
	    driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.id("fname")).sendKeys("Anitha");
	    driver.findElement(By.id("lname")).sendKeys("Sandi");
	    driver.findElement(By.id("email")).sendKeys("anitha@gmail.com");
	    driver.findElement(By.name("addr")).sendKeys("Chennai");
	    driver.findElement(By.id("telephoneno")).sendKeys("5678902344");
	    
	    }
	@When("User enter all valid details")
	public void user_enter_all_valid_details(DataTable customerdetails) {
		List<String> datas = customerdetails.asList();
		driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(datas.get(0));
	    driver.findElement(By.id("lname")).sendKeys(datas.get(1));
	    driver.findElement(By.id("email")).sendKeys(datas.get(2));
	    driver.findElement(By.name("addr")).sendKeys(datas.get(3));
	    driver.findElement(By.id("telephoneno")).sendKeys(datas.get(4));
		
	    
	}
	@When("User enter all valid data")
	public void user_enter_all_valid_data(DataTable cusdetl) {
		Map<String, String> dats = cusdetl.asMap(String.class, String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(dats.get("Fname"));
	    driver.findElement(By.id("lname")).sendKeys(dats.get("Lname"));
	    driver.findElement(By.id("email")).sendKeys(dats.get("Email"));
	    driver.findElement(By.name("addr")).sendKeys(dats.get("Address"));
	    driver.findElement(By.id("telephoneno")).sendKeys(dats.get("Phno"));

	    
	}




	@When("User click on submit button")
	public void user_click_on_submit_button() {
	    driver.findElement(By.name("submit")).click();
	}

	@Then("User should be displayed customer id is generated")
	public void user_should_be_displayed_customer_id_is_generated() {
		WebElement customerId = driver.findElement(By.xpath("(//td[@align='center'])[2]"));
   Assert.assertTrue(customerId.isDisplayed());
   
	}



}

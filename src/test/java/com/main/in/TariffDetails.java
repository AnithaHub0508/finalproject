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

public class TariffDetails {
	static WebDriver driver;
	
	@Given("User should be in home page.")
	public void user_should_be_in_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anitha\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	   driver.get("http://demo.guru99.com/telecom");
	    
	}

	@Given("User click on add customer page.")
	public void user_click_on_add_customer_page() {
	    driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("User enter all tariff details.")
	public void user_enter_all_tariff_details() {
		driver.findElement(By.id("rental1")).sendKeys("300");
		driver.findElement(By.id("local_minutes")).sendKeys("600");
		driver.findElement(By.id("inter_minutes")).sendKeys("200");
		driver.findElement(By.id("sms_pack")).sendKeys("50");
		driver.findElement(By.id("minutes_charges")).sendKeys("20");
		driver.findElement(By.id("inter_charges")).sendKeys("5");
		driver.findElement(By.id("sms_charges")).sendKeys("30");
		
		
	    
	}
	
	@When("User enter all tariff details in field.")
	public void user_enter_all_tariff_details_in_field(DataTable plan) {
		List<String> mins = plan.asList();
		driver.findElement(By.id("rental1")).sendKeys(mins.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(mins.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(mins.get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(mins.get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(mins.get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(mins.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(mins.get(6));
	}
	
	@When("User enter all tariff details in field now.")
	public void user_enter_all_tariff_details_in_field_now(DataTable tariff) {
		Map<String, String> charge = tariff.asMap(String .class, String. class);
		driver.findElement(By.id("rental1")).sendKeys(charge.get("Rent"));
		driver.findElement(By.id("local_minutes")).sendKeys(charge.get("Mins"));
		driver.findElement(By.id("inter_minutes")).sendKeys(charge.get("Inter"));
		driver.findElement(By.id("sms_pack")).sendKeys(charge.get("Sms"));
		driver.findElement(By.id("minutes_charges")).sendKeys(charge.get("Local"));
		driver.findElement(By.id("inter_charges")).sendKeys(charge.get("National"));
		driver.findElement(By.id("sms_charges")).sendKeys(charge.get("Charge"));

	     
	}




	@When("User click on submit button.")
	public void user_click_on_submit_button() {
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("User should be displayed message is generated")
	public void user_should_be_displayed_customer_id_is_generated() {
	    WebElement confirm =driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']"));
	    Assert.assertTrue(confirm.isDisplayed());
	}



}

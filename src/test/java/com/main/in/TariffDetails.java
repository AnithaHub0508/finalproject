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
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anitha\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	   driver.get("http://demo.guru99.com/telecom");
	    
	}

	@Given("User click on add tariff plan")
	public void user_click_on_add_tariff_plan() {
	    driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

		
	@When("User enter the plan details")
	public void user_enter_the_plan_details(DataTable plan) {
		
		  List<List<String>> mins = plan.asLists(String.class);
		driver.findElement(By.id("rental1")).sendKeys(mins.get(0).get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(mins.get(0).get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(mins.get(0).get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(mins.get(0).get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(mins.get(0).get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(mins.get(0).get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(mins.get(0).get(6));
	}
	
	@When("User enter the plannn details.")
	public void user_enter_the_plannn_details(DataTable Cusplan) {
		
   List<Map<String, String>> mins = Cusplan.asMaps(String.class, String.class);
   driver.findElement(By.id("rental1")).sendKeys(mins.get(0).get("Rent"));
	driver.findElement(By.id("local_minutes")).sendKeys(mins.get(0).get("Mins"));
	driver.findElement(By.id("inter_minutes")).sendKeys(mins.get(0).get("Inter"));
	driver.findElement(By.id("sms_pack")).sendKeys(mins.get(0).get("Sms"));
	driver.findElement(By.id("minutes_charges")).sendKeys(mins.get(0).get("fee"));
	driver.findElement(By.id("inter_charges")).sendKeys(mins.get(0).get("National"));
	driver.findElement(By.id("sms_charges")).sendKeys(mins.get(0).get("Cost"));
   
		
		
	    
	}


	
	


	@When("User click the submit button")
	public void user_click_the_submit_button()  {
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("User shold be received message")
	public void user_shold_be_received_message()  {
	    WebElement confirm =driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']"));
	    Assert.assertTrue(confirm.isDisplayed());
	}



}

package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.objectrepository.Addcustomer;
import com.objectrepository.HomePage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Customer extends FunctionalLibrary {




@Given("User click on add customer page")
public void user_click_on_add_customer_page() {
	HomePage home=new HomePage();
	button(home.getAddCustomer());
}

@When("User enter all valid details")
public void user_enter_all_valid_details() {
	Addcustomer cus=new Addcustomer();
	button(cus.getDoneButton());
	type(cus.getFirstName(), "Nila");
	type(cus.getLastName(),"Sandi" );
	type(cus.getMail(),"ani@gmail.com");
	type(cus.getAddress(),"Chennai");
	type(cus.getPhno(), "8978098734");

}

@When("User click on submit button")
public void user_click_on_submit_button() {
	Addcustomer cus= new Addcustomer();
	button(cus.getSubmitButton());
	}

@Then("User should be displayed customer id is generated")
public void user_should_be_displayed_customer_id_is_generated() {
	WebElement customerId = driver.findElement(By.xpath("(//td[@align='center'])[2]"));
	   Assert.assertTrue(customerId.isDisplayed());
}



}

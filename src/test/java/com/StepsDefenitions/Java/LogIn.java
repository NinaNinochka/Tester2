package com.StepsDefenitions.Java;

import org.openqa.selenium.By;

import org.testng.Assert;

import com.Utils.Java.BaseClass;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogIn extends BaseClass {

	
   @When("^i enter valid username \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_valid_username(String logName, String pwd) throws Throwable {
	  driver.findElement(By.xpath("//input[@id='userId']")).sendKeys(logName);
	  driver.findElement(By.xpath("//input[@id='passwordInputField']")).sendKeys(pwd);
	  driver.findElement(By.xpath("//input[@id='olb-btn']")).click();
	}

	@Then("^I see logo is displayed$")
	public void i_see_logo_is_displayed() throws Throwable {
		boolean logo = driver.findElement(By.id("CustProfileDropDownTitle")) != null;
	    Assert.assertTrue(logo);
	    
	    System.out.println(logo+ " is Displayed");
	}
}

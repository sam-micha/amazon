package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLogin {
	
	WebDriver driver;
	
	
	@Given("Launch the browser")
	public void launch_the_browser() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	    
	}

	@Given("Open the Amazon application")
	public void open_the_amazon_application() {
		driver.get("https://www.amazon.in/");
	    WebElement go= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	    go.click();
	}

	@When("Enter the username and password")
	public void enter_the_username_and_password() {
		
		WebElement user= driver.findElement(By.id("ap_email"));
		user.sendKeys("r.samuelmicha@gmail.com");
		WebElement nxt= driver.findElement(By.id("continue"));
		nxt.click();
		WebElement pass= driver.findElement(By.id("ap_password"));
		pass.sendKeys("sammicha47");
	    
	}

	@When("Click the login button")
	public void click_the_login_button() {
		WebElement lgn= driver.findElement(By.id("signInSubmit"));
		lgn.click();
		
	   
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    
	}

	@Then("Close the browser")
	public void close_the_browser() {
	    
	}


}

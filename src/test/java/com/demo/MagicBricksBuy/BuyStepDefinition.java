package com.demo.MagicBricksBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyStepDefinition 
{
	WebDriver driver;
	WebElement buy;
	WebElement PopularChoices;
	WebElement Propertytypes;
	WebElement Explore;
	WebElement Buyingtools;
	
	@Given("User is on the Home Page")
	public void user_is_on_the_Home_Page() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.magicbricks.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);	
		buy = driver.findElement(By.xpath("//a[@id='buyheading']"));
		PopularChoices = driver.findElement(By.xpath("//a[@href='https://www.magicbricks.com/ready-to-move-flats-in-bangalore-pppfs']"));
		Propertytypes = driver.findElement(By.xpath("(//a[@target='_blank'])[4]"));
		Explore = driver.findElement(By.xpath("//*[@href='https://www.magicbricks.com/builders-in-Bangalore']"));
		Buyingtools = driver.findElement(By.xpath("//*[@href='https://www.magicbricks.com/propworth/Bangalore/']"));
	    buy.click();
	}

	@When("User selects Buy")
	public void user_selects_Buy() 
	{
		buy.click();
	}

	@When("User selects required option from Popular Choices")
	public void user_selects_required_option_from_Popular_Choices() throws InterruptedException 
	{
		PopularChoices.click();
		Thread.sleep(2000);
	}

	@Then("User should navigate to ready to move page")
	public void user_should_navigate_to_ready_to_move_page() 
	{
	    
	}

	@When("User selects required option from Property Types")
	public void user_selects_required_option_from_Property_Types() throws InterruptedException 
	{
		Propertytypes.click();
		Thread.sleep(1000);
	}
	@Then("User should navigate to Property Types page")
	public void user_should_navigate_to_Property_Types_page() {
	}

    @When("User selects required option from Explore")
	public void user_selects_required_option_from_Explore() throws InterruptedException
	{
		Explore.click();
		Thread.sleep(1000);
	} 
    @Then("User should navigate to Explore page")
    public void user_should_navigate_to_Explore_page() {
     
    }
	@When("User selects required option from Buying Tools")
	public void user_selects_required_option_from_Buying_Tools() throws InterruptedException
	{
	    Buyingtools.click();
	    Thread.sleep(1000);
	}
	@Then("User should navigate to the Tools page")
	public void user_should_navigate_to_the_Tools_page() {
	}

}

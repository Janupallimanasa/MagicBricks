package PageFactory;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BuyTest {
  @Test
  public void Buy()
  {
	  System.setProperty("Webdriver.chrome.driver","‪C:\\New folder\\chromedriver_win32‪(1)\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver(); 
	  driver.get("https://www.magicbricks.com/");
	  driver.manage().window().maximize();  
	  
	  BuyPageFact by=new BuyPageFact(driver);
	  by.buy();
	  by.PopularChoices();
	  by.PropertyTypes();
	  by.Explore();
	  by.BuyingTools();
  }
}


package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyPageFact
{
  WebDriver driver=null;
  
  @FindBy(xpath="//a[@id='buyheading']")
  WebElement buy;
  
  @FindBy(xpath="//a[@href='https://www.magicbricks.com/ready-to-move-flats-in-bangalore-pppfs']")
  WebElement PopularChoices;
  
  @FindBy(xpath="//a[@target='_blank'])[4]")
  WebElement PropertyTypes;
  
  @FindBy(xpath="//*[@href='https://www.magicbricks.com/builders-in-Bangalore']")
  WebElement Explore;
  
  @FindBy(xpath="//*[@href='https://www.magicbricks.com/propworth/Bangalore/']")
  WebElement BuyingTools;
  
  public BuyPageFact(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
  }
  
  public void buy()
  {
	  buy.click();
  }
  public void PopularChoices()
  {
    PopularChoices.click();
  }
  public void PropertyTypes()
  {
    PropertyTypes.click();
  }
  public void Explore()
  {
    Explore.click();
  }
  public void BuyingTools()
  {
    BuyingTools.click();
  }
}



 




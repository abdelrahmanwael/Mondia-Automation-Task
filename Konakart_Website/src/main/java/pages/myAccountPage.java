package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myAccountPage extends pageBase{
	
  public myAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
  
  @FindBy(linkText="Pending")
  public WebElement orderStatus;

  @FindBy(xpath="//*[@id=\"last-orders\"]/div[2]/table/tbody[2]/tr/td/table/tbody/tr/td[1]/a")
  public WebElement gameName;
  
  @FindBy(xpath="//*[@id=\"last-orders\"]/div[2]/table/tbody[2]/tr/td/table/tbody/tr/td[2]")
  public WebElement gameQuantity;
  
  @FindBy(xpath="//*[@id=\"last-orders\"]/div[2]/table/tbody[2]/tr/td/table/tbody/tr/td[3]")
  public WebElement gamePrice;


  public void orderStatus() {
  }
}

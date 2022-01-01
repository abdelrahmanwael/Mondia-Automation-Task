package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class orderConfirmationPage extends pageBase {
  public orderConfirmationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
  
  @FindBy(id="shippingQuotes")
  public WebElement shippingMethod; 
  
  @FindBy(linkText="CONFIRM ORDER")
  WebElement confirmOrderBtn; 
  
  @FindBy(id="page-title")
  public WebElement orderConfirmationMSG;
  
  @FindBy(linkText="CONTINUE")
  WebElement continueBtn;
  


  public void changeShippingMethod() {
	  Select changeShippingMethod = new Select(shippingMethod);
	  changeShippingMethod.selectByVisibleText("Flat Rate");
  }

  public void confimOrder() {
	clickButton(confirmOrderBtn);
  }
  
  public void proceedToMyAccountPage() {
		clickButton(continueBtn);
	  }
}

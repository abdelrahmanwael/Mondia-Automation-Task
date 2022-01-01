package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class shoppingCartPage extends pageBase{
	
  public shoppingCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    
    @FindBy(id="loginUsername")
	WebElement userNameTxt; 
    
    @FindBy(id="password")
	WebElement passwordTxt; 
    
    @FindBy(linkText="CHECKOUT")
	WebElement checkoutBtn; 
    
    @FindBy(id="continue-button")
	WebElement signInBtn; 
    
    @FindBy(className="basket-body")
	public WebElement checkOutGameName; 
    
    @FindBy(name="prodQty")
	public WebElement gameQuantity; 
    
    @FindBy(xpath="//*[@id=\"cost-overview\"]/table/tbody/tr[1]/td[2]")
	public WebElement subtotalAmount; 
    


//  public void selectQuantity(String quantity) {
//	  setTxtElementTxt(quantityTxtField, quantity);
//  }
    public void checkout() {
    	  clickButton(checkoutBtn);
      }
    public void login(String username, String password) {
  	  setTxtElementTxt(userNameTxt, username);
  	  setTxtElementTxt(passwordTxt, password);
  	  clickButton(signInBtn);
    }
}

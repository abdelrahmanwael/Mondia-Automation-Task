package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class SearchResultsPage extends pageBase {
  public SearchResultsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(linkText="SWAT 3: Close Quarters Battle")
	WebElement gameLink;
	
	@FindBy(linkText="ADD TO CART")
	WebElement addToCartBtn;
	
	@FindBy(className="shopping-cart-item-price")
	public WebElement quantityItems;
	
	@FindBy(className="shopping-cart-item-price")
	public WebElement shoppingCartItem;
	
	@FindBy(id="page-title")
	public WebElement expectedGameName;
	
	@FindBy(className="shopping-cart-item-title")
	public WebElement addedGameName;
	
	@FindBy(xpath="//img[@src='/konakart/images/prod/C/4/9/4/C4941395-021B-4C97-B46C-A4491AD3D620_1_small.jpg']")
	public WebElement firstScreenShot;
	
	@FindBy(xpath="//img[@src='/konakart/images/prod/C/4/9/4/C4941395-021B-4C97-B46C-A4491AD3D620_2_small.jpg']")
	public WebElement secondScreenShot;
	
	@FindBy(xpath="//img[@src='/konakart/images/prod/C/4/9/4/C4941395-021B-4C97-B46C-A4491AD3D620_3_small.jpg']")
	public WebElement thirdScreenShot;
	
	@FindBy(xpath="//img[@src='/konakart/images/prod/C/4/9/4/C4941395-021B-4C97-B46C-A4491AD3D620_4_small.jpg']")
	public WebElement fourthScreenShot;
	
	@FindBy(id="prodQuantityId")
	public WebElement quantityDropDownMenu;
	
	@FindBy(xpath="//*[@id=\"shopping-cart\"]/span[2]")
	WebElement shoppingCart;

  public void addItemToCart() {
	  clickButton(gameLink);
	  clickButton(addToCartBtn);
  }
  public void selectQuantity() {
	  Select quantitySelect = new Select(quantityDropDownMenu);
	  quantitySelect.selectByVisibleText("2");
	  clickButton(addToCartBtn);
  }
  public void openShoppingCart() {
	  clickButton(shoppingCart);
  }
}

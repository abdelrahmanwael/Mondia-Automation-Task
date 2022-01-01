package pages;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class GamesAdvancedSearch extends pageBase {

	public GamesAdvancedSearch(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText="Advanced Search")
	WebElement advancedSearchBtn;
	
	@FindBy(name="categoryId")
	WebElement categoryIDdropdownMenu;
	
	@FindBy(id="priceFromStr")
	public WebElement PriceFromTxtField;
	
	@FindBy(id="priceToStr")
	public WebElement PriceToTxtField;
	
	@FindBy(id="continue-button")
	public WebElement searchBtn;
	
	public void FilterGamesCategory(String priceFrom, String priceTo)
	{	
		clickButton(advancedSearchBtn);
		clickButton(categoryIDdropdownMenu);
		Select menuSelect = new Select(categoryIDdropdownMenu);
		menuSelect.selectByVisibleText("Games");
		setTxtElementTxt(PriceFromTxtField, priceFrom);
		setTxtElementTxt(PriceToTxtField, priceTo);
		clickButton(searchBtn);
	}
}

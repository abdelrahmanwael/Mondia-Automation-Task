package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

//import net.bytebuddy.implementation.bind.annotation.DefaultCall.Binder.DefaultMethodLocator.Implicit;
import pages.SearchResultsPage;

public class addItemToCartTest extends testBase {
	
	SearchResultsPage searchResultObject;
	@Test(priority = 1)
  public void searchResults() {
	  searchResultObject = new SearchResultsPage(driver);
	  searchResultObject.addItemToCart();
	  Assert.assertTrue(searchResultObject.shoppingCartItem.getText().contains("Quantity: 1"));
  }
	@Test(dependsOnMethods = "searchResults")
  public void verifyGameDetails() {
	  String expectedGameName = searchResultObject.expectedGameName.getText();
	  String addedGameName = searchResultObject.addedGameName.getText();
	  if(addedGameName.equals(expectedGameName))
		  System.out.println("Game Title Verified");
	  else
		  System.out.println("Game Title Verification failed");
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,600)");
	  Assert.assertTrue(searchResultObject.firstScreenShot.isDisplayed());
	  Assert.assertTrue(searchResultObject.secondScreenShot.isDisplayed());
	  Assert.assertTrue(searchResultObject.thirdScreenShot.isDisplayed());
	  Assert.assertTrue(searchResultObject.fourthScreenShot.isDisplayed());
  }
	@Test(dependsOnMethods = "verifyGameDetails")
	  public void increaseQuantity() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-600)");
		searchResultObject.selectQuantity();
		Assert.assertTrue(searchResultObject.quantityItems.getText().contains("Quantity: 3"));
	}
	@Test(dependsOnMethods = "verifyGameDetails")
	  public void openCart() {
		searchResultObject.openShoppingCart();
	}

}

package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SearchResultsPage;
import pages.myAccountPage;
import pages.shoppingCartPage;

public class myAccountTest extends testBase {
	
	myAccountPage myAccountObject;
	SearchResultsPage searchResultObject;
	shoppingCartPage shoppingCartObject;
  @Test
  public void verifyOrderDetails() {
	  myAccountObject = new myAccountPage(driver);
	  searchResultObject = new SearchResultsPage(driver);
	  shoppingCartObject = new shoppingCartPage(driver);
	  //verify pending status
	  Assert.assertTrue(myAccountObject.orderStatus.getText().contains("Pending"));
	  //verify game name
	  String resrvedGameName = myAccountObject.gameName.getText();
	  String expectedGameName = searchResultObject.expectedGameName.getText();
	  if(resrvedGameName.equals(expectedGameName))
		  System.out.println("Game Title Verified");
	  else
		  System.out.println("Game Title Verification failed");
	//verify game price
	  String gamePrice = myAccountObject.gamePrice.getText();
	  String expectedSubTotal = shoppingCartObject.subtotalAmount.getText();
	  if(gamePrice.equals(expectedSubTotal))
		  System.out.println("Game price Verified");
	  else
		  System.out.println("Game price Verification failed");
  }
}

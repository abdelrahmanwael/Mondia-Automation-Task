package tests;


import org.testng.annotations.Test;

import pages.GamesAdvancedSearch;

public class selectGamesCategory extends testBase {
	
	GamesAdvancedSearch gamesSearchObject;
	
  @Test
  public void searchForGames() {
	  gamesSearchObject = new GamesAdvancedSearch(driver);
	  gamesSearchObject.FilterGamesCategory("39", "80");
  }
}

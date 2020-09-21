package bdd.TheInternet.PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.TheInternet.PageElements.HomePageLocator;
import bdd.TheInternet.utilities.SetUpDriver;

public class HomePageActions {
	
	HomePageLocator HomePageLocatorObj;

	public HomePageActions() {
		
		HomePageLocatorObj = new HomePageLocator ();
		PageFactory.initElements(SetUpDriver.driver, HomePageLocatorObj);
	}
	
	public void HomePage () {
		
		SetUpDriver.driver.manage().window().maximize();
		SetUpDriver.driver.get("https://the-internet.herokuapp.com/");
		SetUpDriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void clickJSprompt () throws Exception{
		
		Thread.sleep(3000);
		HomePageLocatorObj.lnkJSAlert.click();
		
	}
	
}
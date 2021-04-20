package Com.massMutual.Exercise1.Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage{
	LoginPage loginPage ;
	HomePage homePage ; 

	public HomePageTest() throws IOException {
		super();
	}
	
	//Setting up Initialization before Test
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		 loginPage = new LoginPage();
		 homePage = loginPage.login(prop.getProperty("uName"), "password");
	}
	
	@Test
	public void verifyHomePageExercise(){
		//VALIDATIONS 
		//Capture the amount 
		//Remove $ and , from the numbers
		//convert string to double
		//verify no value is zero
		//verify displayed balance is equal to calculated value
		double dblValue1Amount = Double.parseDouble(homePage.readCurrency(weValue1).replaceAll("[$,]", ""));
		double dblValue2Amount = Double.parseDouble(homePage.readCurrency(weValue2).replaceAll("[$,]", ""));
		double dblValue3Amount = Double.parseDouble(homePage.readCurrency(weValue3).replaceAll("[$,]", ""));
		double dblValue4Amount = Double.parseDouble(homePage.readCurrency(weValue4).replaceAll("[$,]", ""));
		double dblValue5Amount = Double.parseDouble(homePage.readCurrency(weValue5).replaceAll("[$,]", ""));
		double dblTotalBalance = Double.parseDouble(homePage.readCurrency(weTotalBalance).replaceAll("[$,]", ""));
		
		if(dblValue1Amount !=0 && dblValue2Amount !=0 && dblValue3Amount !=0 && dblValue4Amount !=0 && dblValue5Amount !=0 ){
			Assert.assertTrue(true, "No value  is zero");
				double  calcTotalBalance = dblValue1Amount +  dblValue2Amount + dblValue3Amount + dblValue4Amount + dblValue5Amount ;
		        Assert.assertEquals(dblTotalBalance, calcTotalBalance,"Balance displayed is equal to the calculated");
			}
		else{
			Assert.assertFalse(false, "One of the captured amount is zero");
		}
	}
	
}
	
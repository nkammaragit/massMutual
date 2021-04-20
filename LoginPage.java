package Com.massMutual.Exercise1.Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
	
	//Creating PageFactory WebElements for Login Page
	@FindBy(name="userName")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btnSubmit ;
	
	public LoginPage() throws IOException {
		//Initializing WebElements
		PageFactory.initElements(driver, this);
	}

	//Creating Login Test which returns HomePage Object
	public HomePage login(String strUname, String strPassword) throws IOException{
		
		userName.sendKeys(strUname);
		password.sendKeys(strPassword);
		btnSubmit.click();
		return new HomePage();
		
	}
	

}

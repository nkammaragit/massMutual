package Com.massMutual.Exercise1.Tests;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase{
	LoginPage loginPage ;
	
	public LoginPageTest() throws IOException{
		super();
	}
	
	//Setting up Initialization before Test
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		 loginPage = new LoginPage();
	}
	
	//Takes care of Login
	@Test
	public void LoginTest() throws IOException{
		loginPage.login(prop.getProperty("uName"), "password");
	}

}

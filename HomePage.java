package Com.massMutual.Exercise1.Tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
	
	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	//=========Label Values=====
	//Creating PageFactory WebElements for Home Page
	@FindBy(id="lbl_val_1")
	WebElement weValue1 ;
	
	@FindBy(id="lbl_val_2")
	WebElement weValue2 ;
	
	@FindBy(id="lbl_val_3")
	WebElement weValue3 ;
	
	@FindBy(id="lbl_val_4")
	WebElement weValue4 ;
	
	@FindBy(id="lbl_val_5")
	WebElement weValue5 ;
	
	@FindBy(id="lbl_ttl_val")
	WebElement weTotalBalance ;
	
	//===Text Values (Amount) =====
	
	@FindBy(id="txt_val_1")
	WebElement weTxtval1 ;
	
	@FindBy(id="txt_val_2")
	WebElement weTxtval2 ;
	
	@FindBy(id="txt_val_3")
	WebElement weTxtval3 ;
	
	@FindBy(id="txt_val_4")
	WebElement weTxtval4 ;
	
	@FindBy(id="txt_val_5")
	WebElement weTxtval5 ;
	
	@FindBy(id="txt_ttl_val")
	WebElement weTxtTotal ;
	
//	public HomePage (WebDriver driver){
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}
	
	//Returns the text() of the Value Label
	public String getTextOfWebelement(WebElement we){
	  return we.getText();
	}
	
	//Returns the following td of Value Label (amount) 
	public String readCurrency(WebElement we1){
		return driver.findElement(By.xpath("//table[@class='dataTable']//td[contains(.,'" + getTextOfWebelement(we1) +"')]/following::td")).getText();
	}
	
	 
	
	//Working fine
	//table[@class='dataTable']//td[contains(.,'NCC')]
	//table[@class='dataTable']//td[contains(.,'NCC')]/following::td
	
	
	//table/tbody/tr[1]/td[1]/a['NCC']
	//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]/a
	
	
	
	
	
}

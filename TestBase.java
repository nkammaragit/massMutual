package Com.massMutual.Exercise1.Tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase{
	
	public WebDriver driver;
	public WebDriverWait wait ;
	public Properties prop;
	
public TestBase() throws IOException {
	try{
	//Initializing Properties file	
	FileInputStream fis = new FileInputStream("C:\\Users\\naveen\\workspace\\Project1\\src\\ini.properties");
	prop = new Properties();
	prop.load(fis);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e){
		e.printStackTrace();
	}
}	

public void initialization(){
	//Initializing Driver
	System.setProperty("webdriver.chrome.driver",prop.getProperty("driverPath"));
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(prop.getProperty("appUrl"));
	
	//wait.until(ExpectedConditions.visibilityOfElementLocated(submit));
}

}

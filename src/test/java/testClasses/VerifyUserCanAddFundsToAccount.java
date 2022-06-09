package testClasses;

import org.testng.annotations.Test;

import baseClasses.BaseClass;
import pomClasses.FundPage;
import pomClasses.HomePage;
import pomClasses.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class VerifyUserCanAddFundsToAccount {

	WebDriver driver;
	LoginPage lp;
	HomePage hm;
	FundPage fp;
	
  @BeforeClass
  public void beforeClass() {
	  driver= BaseClass.getWebDriver("Chrome");  
  }
	  
  @BeforeMethod
  public void beforeMethod() {
	  lp = new LoginPage(driver);  
  }

  @Test
  public void ClickOnLogin() throws IOException {
	  lp.clickOnLoginButton();
	  lp.enterEmail();
	  lp.clickOnContinueButton();
	  lp.enterPassword();
	  lp.clickOnSubmitButton();
	  lp.enterPin();
  }
  
  @AfterMethod
  public void afterMethod() {
  }


  @AfterClass
  public void afterClass() {
  }

}

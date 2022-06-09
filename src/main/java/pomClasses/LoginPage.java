package pomClasses;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilClasses.UtilClass;

public class LoginPage extends UtilClass {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='absolute-center btn51ParentDimension']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//input[@id='login_email1']")
	private WebElement email;

	@FindBy(xpath="//div[@class='lils382ContinueBtn']")
	private WebElement continuebtn;
	
	@FindBy(xpath="//input[@id='login_password1']")
	private WebElement password;
	
	@FindBy(xpath="//div[contains(@class, 'LoginButton')]")
	private WebElement submitbtn;
	
	@FindBy(xpath="//div[@class='otpinput88item']")
	private WebElement pin;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	public void clickOnLoginButton()
	{
		loginbtn.click();
	}
	public void enterEmail() throws IOException
	{
		expliciteWait(driver, email);
		email.sendKeys(getDataFromPropertyFile("email"));
	}
	public void clickOnContinueButton()
	{
		loginbtn.click();
	}
	public void enterPassword() throws IOException
	{
		expliciteWait(driver, password);
		password.sendKeys(getDataFromPropertyFile("password"));
	}
	public void clickOnSubmitButton()
	{
		submitbtn.click();
	}
	public void enterPin() throws IOException
	{
		expliciteWait(driver, pin);
		List <WebElement> element = driver.findElements(By.xpath("//input[@autocomplete='new-password']"));
		String pin= getDataFromPropertyFile("pin");
		String splitPin[] = pin.split("");
		
		for  (int i=0; i<4; i++)
		{
			System.out.println("sending values @" +i+ "as" +splitPin[i]);
			element.get(i).sendKeys(splitPin[i]);
		}
	}
	
	
	
}

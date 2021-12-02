package Pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpage {
	private WebDriverWait wait;
	private WebDriver driver;
	
	@FindBy (xpath="//input[@type='text']")
	private WebElement username;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath="//button[@value='1']")
	private WebElement login;
	
	public loginpage(WebDriver driver)
	{   this.driver=driver;
		wait =new WebDriverWait(driver,10);
		PageFactory.initElements(driver, this);
		}
	
	public void clickonusername() {
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("prasad.sable988@gmail.com");
	}
	public void clickonpassword() {
		wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys("ganubhau");
	}
	public void clickonlogin() {
		wait.until(ExpectedConditions.visibilityOf(login));
        login.click();
	}

}

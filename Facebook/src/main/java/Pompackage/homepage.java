package Pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homepage {
  private WebDriver driver;
  private WebDriverWait wait;
	@FindBy(xpath="//span[text()='Friends']")
	 private WebElement Friends;
	
	@FindBy(xpath="//span[text()='Groups']")
	 private WebElement Groups;
	
	public homepage(WebDriver driver)
	{   this.driver=driver;
		wait =new WebDriverWait(driver,10);
		PageFactory.initElements(driver, this);
		
	}
	  
	public void  clickonFriends() {
		Friends.click();
	}
	 
	public void clickongroups() {
		Groups.click();
	}
	
	
}

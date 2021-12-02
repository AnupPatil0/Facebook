package Testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pompackage.homepage;
import Pompackage.loginpage;

public class Testclassbymainmethod {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        driver.get("https://www.facebook.com/");

        loginpage loginpage=new loginpage(driver);
        loginpage.clickonusername();
        loginpage.clickonpassword();
        loginpage.clickonlogin();
        
        homepage homepage=new homepage(driver);
        homepage.clickonFriends();
     //  homepage.clickongroups();


	}

}

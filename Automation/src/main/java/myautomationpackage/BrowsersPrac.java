package myautomationpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class BrowsersPrac {

	
	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox") WebElement search;
	@FindBy(id="nav-serach-submit-button") WebElement icon;
	@FindBy(linkText="Customer Service") WebElement customer;
	@FindBy(xpath="//*[text()='computers']") WebElement computer;
	
	 
	 
	
	
}//

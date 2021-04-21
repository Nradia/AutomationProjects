package myautomationpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YaHomepage {

	WebDriver driver;
	
	@FindBy(linkText="Themes") WebElement theme;
	@FindBy(name="search") WebElement searchbar;
	@FindBy(xpath="(//*[@aria-hidden='true'])[17]") WebElement searchicon;
	
	
	
	public YaHomepage(WebDriver driver) 
	
	{
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	public void theme() {
		theme.clear();
	
	}
	
	public void searchbar()
	{
		searchbar.sendKeys("Nonjago lego sets");
	}
	
	public void searchicon()
	{
		searchicon.click();
	}
}//

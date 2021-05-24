package expediaProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeExp {

	public WebDriver driver;
	
	@FindBy(xpath=("(//*[text()='Flights'])[2]")) WebElement flightbutton;
	@FindBy(xpath=("//*[@aria-label='Leaving from']")) WebElement departure ;
	@FindBy(xpath=("//*[@aria-label='Leaving from Newark (EWR - Liberty Intl.)']")) WebElement departActual ;
	@FindBy(id=("location-field-leg1-destination")) WebElement destination ;
	@FindBy(id=("//*[aria-label='Going to San Diego (SAN - San Diego Intl.)']")) WebElement destinationActual ;
	@FindBy(xpath=("//*[text()='Search']")) WebElement searchButton ;
	
	public HomeExp(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void flightbuttonClick() {
		flightbutton.click();
	}
	public void departureFiled()
	{
		departure.sendKeys("New York");
	}	
	
	public void departureActual()
	{
		departActual.click();
	}	
	
	public void destinationField()
	{
		destination.sendKeys("San Diego");
	}	
	public void destinationActual()
	{
		destinationActual.click();
	}
	
	public void searchButton()
	{
		searchButton.click();
	}
	
	
}//

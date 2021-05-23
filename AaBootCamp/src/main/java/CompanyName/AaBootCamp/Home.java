package CompanyName.AaBootCamp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	
	@FindBy(id="headerMyAccount") WebElement MyAccount;
	@FindBy(xpath="//*[text()='Register']") WebElement Register;

	
public Home(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

public void MyAccountClick() {
	MyAccount.click();
}

public void RegisterClick() {
	Register.click();
}

}

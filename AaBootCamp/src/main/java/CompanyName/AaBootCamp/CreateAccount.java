package CompanyName.AaBootCamp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {
public WebDriver driver;
	
@FindBy(id="email") WebElement emailFiled;	
@FindBy(id="password-input-field") WebElement passwordField;
@FindBy(id="zipCode") WebElement ZipCodeField;	
@FindBy(id="phone") WebElement phoneField;	
@FindBy(xpath="(//*[text()='Create an Account'])[2]") WebElement CreateButton;

public CreateAccount(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}

public void emailfieldentry(String email) {
	emailFiled.sendKeys(email);
}
public void passwordfieldentry(String pw) {
	passwordField.sendKeys(pw);
}
	
public void zipcodefieldentry(String zip) {
	ZipCodeField.sendKeys(zip);
}	
	
public void phonefieldentry(String phone) {
	phoneField.sendKeys(phone);
}
public void CreatebuttonClick() {
	CreateButton.click();
}

}

package CompanyName.AaBootCamp;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class HomedpotCreate extends Usability {
	
	WebDriver driver;
	 Home home=new  Home(driver);
	 String email,pw,phone,zip;
	 CreateAndContinue creCont=new  CreateAndContinue(driver);
	 CreateAccount creAcct= new CreateAccount(driver);
	 @Parameters({"email","name","phone","zip","pw"})
  @Test
  public void CreateAccountTest() {
	  home.MyAccountClick();
	  home.RegisterClick();
	  creCont.SelectNcontinueCick();
	  creAcct.emailfieldentry(email);
	  creAcct.passwordfieldentry(pw);
	  creAcct.zipcodefieldentry(zip);
	  creAcct.phonefieldentry(phone);
	  creAcct.CreatebuttonClick();

	  
  }
}

package framework;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {


	

		WebDriver driver;
		@FindBy(id="twotabsearchtextbox") WebElement search;
		@FindBy(id="nav-serach-submit-button") WebElement icon;
		@FindBy(linkText="Customer Service") WebElement customer;
		@FindBy(xpath="//*[text()='computers']") WebElement computer;
		
		  public Home(WebDriver driver)
		  {
			  this.driver=driver;
			  PageFactory.initElements(driver, this);
		  };
		public void searchelementcharacters()
		{
			search.sendKeys("computer");
		}
		public void searciconclick() {
	icon.click();
}
		public void CustomerServiceClick() {
			customer.click();
}
		
		
		public String compterGetxt()
		{
			String textofcopmuter=computer.getText();
			return textofcopmuter;
		}
		
}

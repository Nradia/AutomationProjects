package myautomationpackage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LocPract {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\radia\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://lego.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Actions acct=new Actions(driver);
		WebElement search=driver.findElement(By.className("class=\"MainBarstyles__MenuItemLabel-qk6y7u-9 gFyTkD\""));
		WebElement go=driver.findElement(By.xpath("(//*[@kind='lightTheme'])[3]"));
		//go.click();
		acct.click(go);
				
				
		/*WebElement searchbar=driver.findElement(By.name("News"));
		searchbar.sendKeys("Ninjago set");
		
		WebElement searchicon=driver.findElement(By.xpath("(//*[@aria-hidden='true'])[17]"));
		searchicon.sendKeys("Ninjago set");
		*/
		
		
	}//

}//

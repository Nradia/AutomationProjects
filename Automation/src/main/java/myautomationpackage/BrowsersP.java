package myautomationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowsersP {

	public static void main(String[] args) {
		

		
		 WebDriver driver;
		 
		 System.setProperty("webdriver.edge.driver", "C:\\Users\\radia\\eclipse-workspace\\Automation\\Drivers\\msedgedriver.exe");
		 
		 driver=new EdgeDriver();
		 
		 driver.get("https://pbskids.org");
		 driver.manage().window().maximize();
		 
		 WebElement pink=driver.findElement(By.xpath("//*[@alt='Pinkalicious Fairy House']"));
		 pink.click();
		
		 driver.switchTo().frame(0);
		 WebElement play=driver.findElement(By.xpath("//*[@width='1500']"));
		 
		 play.click();
		 
		 
	}//

}//

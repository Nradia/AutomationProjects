package myautomationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\radia\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		Actions acct=new Actions(driver);
		// always use .bild.perform
		WebElement drug=driver.findElement(By.xpath("//*[text()='Accordion']"));
		//drug.click();
		driver.switchTo().frame(0);
		//acct.moveToElement(drug).build().perform();
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		acct.dragAndDrop(drag, drop).build().perform();
		driver.switchTo().parentFrame();
		
		acct.moveToElement(drug).click().build().perform();
		
	}//
 
}//

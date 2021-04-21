package myautomationpackage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\radia\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		/*simple alert
		WebElement alert1= driver.findElement(By.name("alert"));
		alert1.click();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();*/
		
		/*  Another way:
		  driver.findElement(By.name("alert"));
		  Alert alert1=driver.switchTo().Alert();
		  sustem.out.println(alert)
		  alert.accept();
		   */
		
		//confirmation alert
		
	WebElement confirm=driver.findElement(By.name("Confirmation"));
	confirm.click();
	driver.switchTo().alert();
	Thread.sleep(1000);
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().dismiss();
	
	WebElement prom=driver.findElement(By.name("prompt"));
	prom.click();
	driver.switchTo().alert().sendKeys("Yanis is AWESOME");
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
		
		
		
		
		
		
		
	}//

}//

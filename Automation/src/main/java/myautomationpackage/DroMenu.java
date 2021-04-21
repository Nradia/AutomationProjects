package myautomationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DroMenu {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\radia\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		WebElement createB=driver.findElement(By.xpath(("(//*[@role='button'])[2]")));
		createB.click();
		Thread.sleep(1000);
		WebElement name=driver.findElement(By.name("firstname"));
		name.sendKeys("Nora");
		WebElement month=driver.findElement(By.id("month"));
		month.click();
		Select ob1=new Select(month);
		ob1.selectByValue("12");
		//ob1.selectByIndex(2); 
		//ob1.selectByVisibleText("Mar");
		WebElement day=driver.findElement(By.id("day"));
		Select ob2=new Select(day);
		ob2.selectByValue("12");
		WebElement year=driver.findElement(By.id("year"));
		Select ob3=new Select(year);
		ob3.selectByIndex(10);
		
		
		
		
		
		
		
	}//

}//

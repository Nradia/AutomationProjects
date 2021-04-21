package com.PeopleTach.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerrts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\radia\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		/*WebElement alerts=driver.findElement((By.name("alert")));
		alerts.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		WebElement switching=driver.findElement(By.name("prompt"));
		switching.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("john silver");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		WebElement doubleClick=driver.findElement((By.id("double-click")));
		driver.switchTo().alert().accept();*/
		
		
		/*WebElement confirm=driver.findElement(By.name("confirmation"));
		confirm.click();
		driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();*/
		
		
		//prompt alert
		
		WebElement prom=driver.findElement(By.name("prompt"));
		prom.click();
		driver.switchTo().alert().sendKeys("Yanis is AWESOME");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();

	
	}//

}//

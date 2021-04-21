package com.PeopleTach.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Poinnters {

	public static void main(String[] args) {
		// 
		  WebDriver driver;
		
		
			
			// first argument below to find chrome, second it gives location to open it 

			System.setProperty("webdriver.chrome.driver","C:\\Users\\radia\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
			
			// call the constructor
			driver= new ChromeDriver();
			
			driver.get("https://jqueryui.com/droppable/");
		
			driver.manage().window().maximize();
			
		    Actions ob=new Actions(driver);
			/*WebElement signin=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
			ob.moveToElement(signin).build().perform();
		
			/*WebElement linkedid=driver.findElement(By.linkText(" Kindle Unlimited"));
			ob.moveToElement(linkedid).build().perform();*/
		    
			// iframe
			
			driver.switchTo().frame(0);	
			WebElement dragged=driver.findElement(By.id("draggable"));
			WebElement dropped=driver.findElement(By.id("droppable"));
			
			ob.dragAndDrop(dragged,dropped).build().perform();
			driver.switchTo().parentFrame()	;
			
			WebElement fromText=driver.findElement(By.xpath("//*[text()='droppable'])[1]"));
			String txt=fromText.getText();
			System.out.println(txt);
	}//

}//

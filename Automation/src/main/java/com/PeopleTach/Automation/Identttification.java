package com.PeopleTach.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identttification {

	public static void main(String[] args) {

		
		// call the constructor
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\radia\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
				driver.get("https://amazon.com");
				// maximize the browser
				driver.manage().window().maximize();
				// pause script for 6 second
				//put the element in a variable
		/*WebElement Sicon= driver.findElement(By.id("nav-subnav-toaster"));
		
		Sicon.click();*/
				
				WebElement searchIcon= driver.findElement(By.id("nav-search-submit-button"));
				
				WebElement fields=driver.findElement(By.name("field-keywords"));
				fields.sendKeys("computer");
				searchIcon.click();
				WebElement books=driver.findElement(By.linkText("Books"));
				//books.sendKeys(" Harry Potter");
				books.click();
				WebElement lw=driver.findElement(By.partialLinkText("Spring clean with"));
				lw.click();
				WebElement cla=driver.findElement(By.className("nav-nava-2 nav-progressive"));
				cla.click();
				WebElement rturn=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/a)[4]"));
				rturn.click();
				WebElement lg=driver.findElement(By.xpath("//*[contains(text()='Spring Clean with'"));
				lg.click();
				
			  driver.quit();
	}//

}//

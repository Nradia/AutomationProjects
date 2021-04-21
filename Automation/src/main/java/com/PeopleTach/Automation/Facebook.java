package com.PeopleTach.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\radia\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		
		driver= new ChromeDriver();

		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		WebElement create=driver.findElement(By.linkText("Create New Account"));
		create.click();
		Thread.sleep(1000);
		WebElement firstname=driver.findElement(By.name("firstname")) ;
		firstname.sendKeys("Radia");
		Thread.sleep(1000);
		
		WebElement lastname=driver.findElement(By.name("lastname")) ;
		lastname.sendKeys("nn");
		Thread.sleep(1000);
		WebElement phone=driver.findElement(By.name("reg_email__")) ;
		phone.sendKeys("rblank58@gmail");
		Thread.sleep(1000);
		WebElement pw=driver.findElement(By.name("reg_passwd__")) ;
		pw.sendKeys("mk87diail");
		//Thread.sleep(1000);
		
		WebElement months=driver.findElement(By.name("birthday_month)"));
		Select ob=new Select(months);

		ob.selectByIndex(9);
		//Thread.sleep(1000);
		//ob.selectByValue("5");
		//Thread.sleep(1000);
		//ob.selectByVisibleText("Mar");
		
		WebElement male=driver.findElement(By.xpath("(//*{[@name='sex'][2])"));
		male.click();
	}//

}//

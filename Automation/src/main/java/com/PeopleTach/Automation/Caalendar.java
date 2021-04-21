package com.PeopleTach.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\radia\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.get("https://travelocity.com/flights");
		
		driver.manage().window().maximize();
		WebElement flight=driver.findElement(By.id("d1-btn"));
		flight.click();
		WebElement dt=driver.findElement(By.xpath("(//*[aria-label='Apr 26, 2021.']"));
		dt.click();
		//WebElement dt2=driver.findElement(By.xpath("//*[text()='Departing selected']"));
		//dt2.click();
		
		
	}//

}//

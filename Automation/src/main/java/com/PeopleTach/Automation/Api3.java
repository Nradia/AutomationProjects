package com.PeopleTach.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Api3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	     WebDriver driver; // interface
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\radia\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		
		 driver=new ChromeDriver(); // class
		
		driver.get("https://yahoo.com");
		
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		String url=driver.getTitle();
		System.out.println(" The page title is "+ url);
		String wh=driver.getWindowHandle();
		System.out.println("The window habdle for this session is "+wh);
		driver.close();
		
		
	}//

}//

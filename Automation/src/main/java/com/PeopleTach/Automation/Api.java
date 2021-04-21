package com.PeopleTach.Automation;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Api {

	
	// create a global reference variable
	
	// give reference to webdriver interface
	
	static  WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		// first argument below to find chrome, second it gives location to open it 

		System.setProperty("webdriver.chrome.driver","C:\\Users\\radia\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		
		// call the constructor
		driver= new ChromeDriver();
		
		driver.get("https://amazon.com");
		
		// maximize the browser
		driver.manage().window().maximize();
		// pause script for 6 second
	
		Thread.sleep(6000);// use it so actions does not happen very fats we can see steps 1000=1 second
		//refresh your browser6
		driver.navigate().refresh();
		
		// click button back means browser goes back go back 
		driver.navigate().back();
		Thread.sleep(6000);
		// click forward
		driver.navigate().forward();
		
		
		// get url of application. to print it mention Sting
	String url= driver.getCurrentUrl();
		System.out.println(url);
		// get title page; what shows on the tab
		String titl=driver.getTitle();
		System.out.println(titl);
		// print window handle id
		
		String windowhandle=driver.getWindowHandle();
		System.out.println(windowhandle);
		Thread.sleep(20000);
		
		driver.close();
	}//

}//

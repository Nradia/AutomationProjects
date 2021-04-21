package com.PeopleTach.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
public class Api1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		
		WebDriver driver1;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\radia\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		
		driver1=new ChromeDriver();
		
		driver1.get("https://pbskids.org");
		
		driver1.manage().window().maximize();
		driver1.navigate().refresh();
		Thread.sleep(4000);
		driver1.navigate().back();
		driver1.navigate().forward();
		String url=driver1.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(4000);
		driver1.getTitle();
		
		Date dt=new Date();
		  System.out.println(dt);
		  String si=dt.toString().replace(" ","-").replace(":","-");
		  System.out.println(si);
		File shotsofscreen = ((TakesScreenshot) driver1).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(shotsofscreen,new File ("C:\\Users\\radia\\eclipse-workspace\\Automation\\Pictures"+si+"shots.png"));
		//driver1.close();
	
		
		
	}//
}//

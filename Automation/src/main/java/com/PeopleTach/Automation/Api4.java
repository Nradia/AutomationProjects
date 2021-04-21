package com.PeopleTach.Automation;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Api4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		for(int i=0;i<3;i++) {
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\radia\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 
		 
		 driver.get("https://bricklink.com");
		 driver.manage().window().maximize();
		 driver.navigate().refresh();
		 Thread.sleep(3000);
		 driver.navigate().back();
		 Thread.sleep(3000);
		 driver.navigate().forward();
		 Thread.sleep(3000);
		//tring pg= driver.getPageSource();
		 //stem.out.println(" This is the page source "+ pg);
		 Thread.sleep(1000);
		 driver.close();}
}//
}//

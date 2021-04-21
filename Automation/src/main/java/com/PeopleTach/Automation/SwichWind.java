package com.PeopleTach.Automation;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwichWind {

	public static void main(String[] args) {
		
		
		WebDriver driver;
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\radia\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			
			driver.get("https://amazon.com");
			driver.manage().window().maximize();
					
			Actions ob=new Actions(driver);
			ob.keyDown(Keys.SHIFT).build().perform();
			WebElement bt=driver.findElement(By.linkText("Best Sellers"));
			bt.click();
				// key up to release the key
			ob.keyUp(Keys.SHIFT).build().perform();
			String win=driver.getWindowHandle();
			System.out.println(win);
			Set<String> windowsid=driver.getWindowHandles();
		
			//Iterator
			/*    Iterator <String> windows=windowsid.iterator();
			String firstH=windows.next();
			String secondH=windows.next();
			driver.switchTo().window(secondH);
			WebElement New=driver.findElement(By.linkText("Cell Phones & Accessories"));
			New.click();
			driver.switchTo().window(secondH)
	}*/

}
}

package myautomationpackage;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\radia\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			
			driver.get("https://yahoo.com");
			driver.manage().window().maximize();
			Actions  ob=new Actions (driver);
			WebElement bst=driver.findElement(By.linkText("Shopping"));
			ob.keyDown(Keys.SHIFT).build().perform();
			bst.click();
			ob.keyUp(Keys.SHIFT);
			String windowId=driver.getWindowHandle();
			System.out.println(windowId);
		// windowhandles get all the id of opened windows when running the prg. we have to store these in a
			Set<String>    windowHnadls=driver.getWindowHandles();
			java.util.Iterator<String >   windowList=windowHnadls.iterator();
			
			String firsthandle=windowList.next();
			String secondhandle=windowList.next();
			System.out.println(firsthandle);
			System.out.println(secondhandle);
	}//

}//

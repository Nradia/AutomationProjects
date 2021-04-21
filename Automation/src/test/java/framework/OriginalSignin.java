package framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;



package framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class signin extends Coomon {
	
	//WebDriver driver;
	
	Home home=new Home(driver);
  @Test(priority=1)
  public void f() {
	  
	  home.search.click();
	  //shot();
	  home.icon.click();
	 
	  String tx=home.compterGetxt();
	  System.out.println(tx);
	 // Assert.assertEquals(tx, "\"Computer\"");
	 // home.CustomerServiceClick();
	  SoftAssert ob=new SoftAssert();
	  ob.assertEquals(tx, "\"Computer\"");
	  home.CustomerServiceClick();
	  
	  //to show result how many pass and fail
	  
	  ob.assertAll();
	  
  }
  
  @Test  //(priority=2, depend On Method="f")
  public void verificatio() {
	  System.out.println("This is verification");
	  Home home=new Home(driver);
	  home.CustomerServiceClick();
  }
@Parameters
  @BeforeClass
  public void beforeClass() {
	  
//browsers("chrome");

	  //System.setProperty("webdriver.chrome.driver","C:\\Users\\radia\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
	  /*System.setProperty("webdriver.gecko.driver","C:\\Users\\radia\\eclipse-workspace\\Automation\\Drivers\\geckodriver.exe");
	   driver= new FirefoxDriver();*/
	/*  System.setProperty("webdriver.edge.driver","C:\\Users\\radia\\eclipse-workspace\\Automation\\Drivers\\msedgedriver.exe");
		 driver= new EdgeDriver();
	  
		driver.get("https://amazon.com");
	
		driver.manage().window().maximize();*/
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  public void shot() throws IOException
{
	  Date dt=new Date();
	  System.out.println(dt);
	  String si=dt.toString().replace(" ","-").replace(":","-");
	  System.out.println(si);
	//put it in a file to save screenshot in it
	File shotsofscreen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(shotsofscreen,new File (C:\Users\radia\eclipse-workspace\Automation\Pictures+"si"+shots.png));
	}
 /* 
  public void browsers(String browser)
  {
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\radia\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://amazon.com");
			driver.manage().window().maximize();
	  }
	  
	  else if(browser.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\radia\\eclipse-workspace\\Automation\\Drivers\\geckodriver.exe");
		   driver= new FirefoxDriver();
		   driver.get("https://amazon.com");
		driver.manage().window().maximize();
	  }
	  
	  else if(browser.equalsIgnoreCase("edge"))
	  {
		  System.setProperty("webdriver.edge.driver","C:\\Users\\radia\\eclipse-workspace\\Automation\\Drivers\\msedgedriver.exe");
			 driver= new EdgeDriver();
		  driver.get("https://amazon.com");
			driver.manage().window().maximize();
	  }*/
	  
  }
}


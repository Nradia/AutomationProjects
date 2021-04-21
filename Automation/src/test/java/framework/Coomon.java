package framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Coomon {
  public WebDriver driver;
  @Parameters({"browser","website"})
  
  @BeforeClass
  public void beforeClass(String browser,String site) {
	  String path=System.getProperty("user.dir");
	  
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver",path+"\\Drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://amazon.com");
			driver.manage().window().maximize();
	  }
	  
	  else if(browser.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver",path+"\\Drivers\\chromedriver.exe");
		   driver= new FirefoxDriver();
		   driver.get("https://amazon.com");
		driver.manage().window().maximize();
	  }
	  
	  else if(browser.equalsIgnoreCase("edge"))
	  {
		  System.setProperty("webdriver.edge.driver",path+"\\Drivers\\chromedriver.exe");
			 driver= new EdgeDriver();
		  driver.get("https://amazon.com");
			driver.manage().window().maximize();
	  }
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}

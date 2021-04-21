package myautomationpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class YaHomePage {
	
	
	WebDriver driver;

YaHomepage home=new YaHomepage(driver);

  @Test
  public void f() {
	  
	  home.theme();
	  home.searchbar();
	  home.searchicon();
  }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\radia\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://lego.com");
	driver.manage().window().maximize();
	Thread.sleep(10000);  
	  
  }
  
  @AfterClass
  public void afterClass() {
	  
	driver.close();
  }

}//

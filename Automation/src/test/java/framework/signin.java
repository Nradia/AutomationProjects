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
  
  @Test  
  public void verificatio() {
	  System.out.println("This is verification");
	  Home home=new Home(driver);
	  home.CustomerServiceClick();
  }
  
}
  






package framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Amazon {
  @Test
  

  public void f() {
	  System.out.println(" run @Test ");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("print before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("print after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println(" run before class ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println(" run after class ");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println(" run before test ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println(" run after test ");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println(" run before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println(" run after class ");
  }
 

}

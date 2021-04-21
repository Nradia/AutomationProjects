package myautomationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class EllmntLocPrac1 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", ("C:\\Users\\\\radia\\\\eclipse-workspace\\\\Automation\\\\Drivers\\\\chromedriver.exe"));
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		
		//WebElement  search=driver.findElement(By.id("nav-search-submit-button"));
		
		/*WebElement field=driver.findElement(By.id("twotabsearchtextbox"));
		field.sendKeys("boys cleats");
		WebElement  search=driver.findElement(By.id("nav-search-submit-button"));
		search.click();
		driver.navigate().refresh();
		WebElement fashion=driver.findElement(By.linkText("Fashion"));
		fashion.click();
		WebElement fashion1=driver.findElement(By.partialLinkText("Fash"));
		fashion1.click();
		WebElement computer=driver.findElement(By.linkText("Computers"));
		computer.click();
		
		/*WebElement teeturtle=driver.findElement(By.xpath("(/html/body/div/header/div/div/div/div/a/span)[7]"));
		teeturtle.click();
		Thread.sleep(1000);*/
		
		WebElement amz=driver.findElement(By.xpath("//a[@aria-label='Amazon']"));
		amz.click();
	//driver.close(); //*[data-csa-c-id='qy6s4m-vgreul-61fdak-x90j6u']  //html/body/div/div/div/div/div/div/div/a/div/div/img  /html/body/header/div/div[4]/div[2]/div[2]/div/a[4]
		
		WebElement bestSeller=driver.findElement(By.xpath("(//*[text()='Best Sellers'])[1]"));
		bestSeller.click();
		
		WebElement customer=driver.findElement(By.xpath("(//*[text()='Customer Service'])"));
		customer.click();
		//path issues?
		WebElement mother=driver.findElement(By.xpath("(//*[@role='presentation'])[3]"));
		mother.click();
		
		
		
	}//

}//

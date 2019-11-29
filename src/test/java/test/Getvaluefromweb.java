package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Getvaluefromweb {
	
	@Test
	public void Addtest()   {
		
		WebDriver driver = new ChromeDriver();
		//verify webtitle
		//String ExpectedTitle = "Login - TechFios Test Application - Billing";
		//String ActualTiltle = "";
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		
		driver.get("https://www.dell.com/en-us#");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//learn action class what action clas done is mouse over
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"l1_5\"]"))).build().perform();
		actions.moveToElement(driver.findElement(By.linkText("For Home Purchases"))).build().perform();
		driver.findElement(By.linkText("Learn about Financing")).click();
		
		//frame
		//driver.switchTo().frame("classFrame");
		//driver.findElement(By.linkText("Deprecated")).click();
		//deal with the alerts
		/*driver.findElement(By.name("proceed")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();
		driver.findElement(By.id("login1")).sendKeys("12345");*/
		//ActualTiltle = driver.getTitle();
		//if(ActualTiltle.contentEquals(ExpectedTitle)){
			//System.out.println("test case passed");
			
		//}
		//else {
			//System.out.println("test case failed");
		//}
;		
		//driver.findElement(By.id("username")).sendKeys("techfios");
		//driver.findElement(By.id("password")).sendKeys("abc123");
		
		//String username = driver.findElement(By.id("username")).getAttribute("value");
		//System.out.println("username is>>>>>>"+ username);
		//String password = driver.findElement(By.id("password")).getAttribute("value");
		//System.out.println("Pasword is>>>>>>>"+password);
		
		//driver.findElement(By.name("login")).click();
		//String error = driver.findElement(By.xpath("//div[@class=\"alert alert-danger fade in\"]")).getAttribute("value");
		//System.out.println("the Error is"+error);
		driver.quit();
	
	

}
}

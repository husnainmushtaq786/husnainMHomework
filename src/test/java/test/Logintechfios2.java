package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Logintechfios2 {
	
	
	
	@Test
	public void Addtest() {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		driver.get("http://demo.guru99.com/test/newtours");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("REGISTER")).click();
		
		// use select class to choose drop down option very important in interview question
		WebElement ele = driver.findElement(By.xpath("//select[@name=\"country\"]"));
		Select select = new Select(ele);
		select.selectByVisibleText("ANDORRA");
		
		//below just to see if the register link is there by boolean 
		//driver.findElement(By.linkText("REGISTER")).isDisplayed();
		//boolean q = driver.findElement(By.linkText("REGISTER")).isDisplayed();
		
		//System.out.println(q);
		//below not working
		//WebElement ele = driver.findElement(By.linkText("REGISTER"));
		//ele.isDisplayed();
		//Assert.assertTrue(condition);
		
		
		//List<WebElement>ele = driver.findElements(By.tagName("a"));
		//System.out.println("Number of link are"  + "  "+  ele.size());
		////for(int i=0;i<ele.size();i++) {
			//System.out.println("Number of link" + "  "+ele.get(i).getAttribute("href"));
			
		//}
		//driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("abc123");
		//driver.findElement(By.name("login")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

}
}

package test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addcontacttest {
	@Test
	
	public void Addtest() {
	
	WebDriver driver = new ChromeDriver();
	//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	driver.get("http://techfios.com/test/billing/?ng=admin/");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("techfiosdemo@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");
	driver.findElement(By.xpath("//button[contains(text(),'Sign')] ")).click();
	
	//store an element
	boolean pageTitleDisplayedStatus;
	try {
		WebElement PAGE_TITLE_ELEMENT = driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"));
		pageTitleDisplayedStatus = true;
	}catch(org.openqa.selenium.NoSuchElementException e) {
	    pageTitleDisplayedStatus = false;
		
	}
		//By PAGE_TITLE_LOCATOR = By.xpath("//h2[contains(text(),'Dashboard')]");
		//driver.findElement(PAGE_TITLE_LOCATOR).isDisplayed();
		//PAGE_TITLE_ELEMENT.isDisplayed();
		//PAGE_TITLE_ELEMENT.click();
		//driver.findElement(PAGE_TITLE_LOCATOR).click();
	
	//Explicit wait given to the driver
	//WebDriverWait wait = new WebDriverWait(driver,5);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(PAGE_TITLE_LOCATOR));
	Assert.assertTrue("Dashboard Tiltle did not Displayed",pageTitleDisplayedStatus);
	
	
	
	
	//driver.quit();
	/*driver.findElement(By.xpath("//*[contains(text(),'CRM')]")).click();
	driver.findElement(By.xpath("//*[contains(text(),'Add Contact')]")).click();
	
	driver.findElement(By.id("account")).sendKeys("john smith");
	driver.findElement(By.id("company")).sendKeys("Nokia");
	driver.findElement(By.id("email")).sendKeys("john@gmail.com");
	driver.findElement(By.id("phone")).sendKeys("786-630-6442");
	driver.findElement(By.id("address")).sendKeys("8440 southampton dr");
	driver.findElement(By.id("city")).sendKeys("miramar");
	driver.findElement(By.id("state")).sendKeys("florida");
	driver.findElement(By.id("zip")).sendKeys("33025");
	driver.findElement(By.id("submit")).click();*/
	//driver.close();
	//driver.quit();

}
}
package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logintechfios {
	
	@Test
	public void logintechfios()  {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		driver.get("http://demo.guru99.com/test/newtours/");
		//driver.findElement(By.linkText("REGISTER")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		driver.findElement(By.xpath("//*[contains(text(),'REGISTER')]")).click();
		//impliit way in interview they ask about alot about syncronization means time delays//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.findElement(By.name("firstName")).sendKeys("husnain");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement REGISTER;
		REGISTER=wait.until(ExpectedConditions.visibilityOf((WebElement) By.xpath("//*[contains(text(),'REGISTER')]")));
		driver.findElement(By.name("lastName")).sendKeys("mushtaq");
		driver.findElement(By.name("phone")).sendKeys("786-630-6442");
		driver.findElement(By.id("userName")).sendKeys("husnain@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("8440 southampton dr");
		driver.findElement(By.name("city")).sendKeys("miramar");
		driver.findElement(By.name("state")).sendKeys("florida");
		driver.findElement(By.name("postalCode")).sendKeys("33056");
		driver.findElement(By.name("country")).sendKeys("pakistan");
		driver.findElement(By.id("email")).sendKeys("husnain786");
		driver.findElement(By.name("password")).sendKeys("husnain123");
		driver.findElement(By.name("confirmPassword")).sendKeys("husnain123");
		driver.findElement(By.name("submit")).click();
		
		/*driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CRM')]")).click();
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

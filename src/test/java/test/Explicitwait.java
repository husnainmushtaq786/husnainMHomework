package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Explicitwait {
	@Test
		public void Addtest()   {
			
			WebDriver driver = new ChromeDriver();
			//verify webtitle
			//String ExpectedTitle = "Login - TechFios Test Application - Billing";
			//String ActualTiltle = "";
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
			
			driver.get("http://southwest.com/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//working with calander
			driver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys("ft.lauderdale");
			driver.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys("Dallas (Love Field)");
			
			/*try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// 
				e.printStackTrace();
			}*/
			//JavascriptExecutor date =	(JavascriptExecutor) driver;
			//date.executeScript("dacument.getElementByid('LandingAirBookingSearchForm_departureDate').value='11/25/2019'");
			//date.executeScript("dacument.getElementByid('LandingAirBookingSearchForm_returnDate').value='11/28/2019'");
			driver.findElement(By.id("LandingAirBookingSearchForm_submit-button")).click();
			
			try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// 
			e.printStackTrace();
		}
			driver.quit();
			
			//Explicit wait
			//WebDriverWait wait = new WebDriverWait(driver,25);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("REGISTER")));
			// we can also use visibilityofelementlocated
		    //driver.findElement(By.linkText("REGISTER")).click();
		    
			
}
}


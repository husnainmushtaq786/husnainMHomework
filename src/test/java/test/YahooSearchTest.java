package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class YahooSearchTest {
	
	
	@Test

	public void yahoonewtabopen() {

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.yahoo.com/");
		
		
		By SEARCH_FIELD_ELEMENT = By.id("uh-search-box");
		By CLICK_ON_WESCHOOL_SEARCH=By.xpath("//a[contains(text(),'XPath Tutorial - w3schools.com')]");
		By SQL_MENU_LOCATOR =By.linkText("SQL");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		driver.findElement(SEARCH_FIELD_ELEMENT).sendKeys("xpath");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		driver.findElement(SEARCH_FIELD_ELEMENT).sendKeys(Keys.ENTER);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(CLICK_ON_WESCHOOL_SEARCH).click();
		System.out.println(driver.getWindowHandles());
		
		
		for(String s:driver.getWindowHandles()) {
			driver.switchTo().window(s);
			
		}
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(SQL_MENU_LOCATOR).click();
		
		//controling graphics and scrolling up n down
				//JavaScriptExecutor js = (JavaScriptExecutor)driver;
				//js.executeScript("scroll(0,400)");
		
		driver.close();
		driver.quit();
}
}
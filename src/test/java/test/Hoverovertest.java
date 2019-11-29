package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverovertest {
	
	
	@Test

	public void validateDellSiteHoverOver() {

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://dell.com/en-us");
		
		WebElement SOLUTION_MODULE_ELEMENT = driver.findElement(By.xpath("//button[contains(text(),'Solutions')]"));
		WebElement DESKTOP_SOLUTIONS_PAGE_ELEMENT = driver.findElement(By.xpath("//a[contains(text(),'Desktop Virtualization')]"));
		//HOVER OVER -CREATE AN OBJECT OF ACTIONS CLASS
		Actions action = new Actions(driver);
		action.moveToElement(SOLUTION_MODULE_ELEMENT).build().perform();
		
		DESKTOP_SOLUTIONS_PAGE_ELEMENT.click();
	
	

}
}
package test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frametest {

	@Test

	public void Handlepopup() {

		WebDriver driver = new ChromeDriver();
		// System.setProperty("webdriver.chrome.driver",
		// System.getProperty("user.dir")+"/chromedriver");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://docs.oracle.com/javase/8/docs/api/");

		By JAVA_APPLET_LOCATOR = By.linkText("java.applet");
		driver.switchTo().frame("packageListFrame");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(JAVA_APPLET_LOCATOR).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//span[contains(text(),'AppletContext')]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		 driver.close();
		 driver.quit();

	}

	private void waitForElement(WebDriver driver, int timeInSeconds, By locator) {

		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
}

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

public class handlePopupAlerts {

	@Test

	public void Handlepopup() {

		WebDriver driver = new ChromeDriver();
		// System.setProperty("webdriver.chrome.driver",
		// System.getProperty("user.dir")+"/chromedriver");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://mail.rediff.com/cgi-bin/login.cgi");

		By GO_BUTTON_LOCATOR = By.name("proceed");
		driver.findElement(GO_BUTTON_LOCATOR).click();
		
		driver.switchTo().alert().accept();

		 //driver.close();
		 //driver.quit();

	}

	private void waitForElement(WebDriver driver, int timeInSeconds, By locator) {

		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
}

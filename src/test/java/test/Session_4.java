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

public class Session_4 {

	@Test

	public void Addtest1() {

		WebDriver driver = new ChromeDriver();
		// System.setProperty("webdriver.chrome.driver",
		// System.getProperty("user.dir")+"/chromedriver");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/billing/?ng=admin/");

		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[contains(text(),'Sign')] ")).click();

		// ELEMENT LIBRARAY
		By PAGE_TITLE_LOCATOR = By.xpath("//h2[contains(text(),'Dashboard')]");
		By ADD_CONTACT_SIDE_NAV_LOCATOR = By
				.xpath("//span[text()='CRM']/parent::*/following-sibling::ul/descendant::a[contains(@href,'add')]");
		By CRM_SIDE_NAV_LOCATOR = By.xpath("//ul[@id='side-menu']/descendant::span[text()='CRM']");
		By FULL_NAME_INPUT_FIELD_LOCATOR = By.id("account");
		By COMPANY_NAME_INPUT_FIELD_LOCATOR = By.id("company");
		By EMAIL_INPUT_FIELD_LOCATOR = By.id("email");
		By PHONE_INPUT_FIELD_LOCATOR = By.id("phone");
		By ADDRESS_INPUT_FIELD_LOCATOR = By.id("address");
		By CITY_INPUT_FIELD_LOCATOR = By.id("city");
		By STATE_NAME_INPUT_FIELD_LOCATOR = By.id("state");
		By ZIP_NAME_INPUT_FIELD_LOCATOR = By.id("zip");
		By SUBMIT_BUTTON_LOCATOR = By.id("submit");
		By LIST_CONTACT_SIDE_NAV_LOCATOR = By.linkText("List Contacts");
		By NEWLY_ADDED_DISPLAYED_CONTACT_LOCATOR = By.xpath("//table//tbody/descendant::tr[1]/td[2]/a");

		Random rnd = new Random();
		int randomNumber = rnd.nextInt(999);

		String fullName = "husnain" + randomNumber;
		String companyName = "Techfios" + randomNumber;
		String email = "techfios" + randomNumber + "@gmail.com";
		String phone = "123456" + randomNumber;
		String address = randomNumber + "Street";
		String city = "miami" + randomNumber;
		String state = "fl";
		String zip = "33056";

		waitForElement(driver, 10, PAGE_TITLE_LOCATOR);
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(PAGE_TITLE_LOCATOR));

		driver.findElement(CRM_SIDE_NAV_LOCATOR).click();
		waitForElement(driver, 10, ADD_CONTACT_SIDE_NAV_LOCATOR);
		driver.findElement(ADD_CONTACT_SIDE_NAV_LOCATOR).click();

		waitForElement(driver, 20, FULL_NAME_INPUT_FIELD_LOCATOR);

		driver.findElement(FULL_NAME_INPUT_FIELD_LOCATOR).sendKeys(fullName);
		driver.findElement(COMPANY_NAME_INPUT_FIELD_LOCATOR).sendKeys(companyName);
		driver.findElement(EMAIL_INPUT_FIELD_LOCATOR).sendKeys(email);
		driver.findElement(PHONE_INPUT_FIELD_LOCATOR).sendKeys(phone);
		driver.findElement(ADDRESS_INPUT_FIELD_LOCATOR).sendKeys(address);
		driver.findElement(CITY_INPUT_FIELD_LOCATOR).sendKeys(city);
		driver.findElement(STATE_NAME_INPUT_FIELD_LOCATOR).sendKeys(state);
		driver.findElement(ZIP_NAME_INPUT_FIELD_LOCATOR).sendKeys(zip);
		driver.findElement(SUBMIT_BUTTON_LOCATOR).click();
		driver.findElement(LIST_CONTACT_SIDE_NAV_LOCATOR).click();

		// VERIFY THE CONTACT ADDED
		String displayedContactname = driver.findElement(NEWLY_ADDED_DISPLAYED_CONTACT_LOCATOR).getText();
		System.out.println("expected Name " + fullName);
		System.out.println("atual Name" + displayedContactname);
		Assert.assertEquals("RELEVANT CONTACT NAME NOT FOUND", fullName, displayedContactname);

		try {
			Thread.sleep(3000);
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

package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DemonautRegister {
	public static final String URL = "http://newtours.demoaut.com/mercuryregister.php";
	private static final String TXTNAME_XPATH = "//input[@name='firstName']";
	private static final String TXTLASTNAME_XPATH = "//input[@name='lastName']";
	private static final String TXTPHONE_XPATH = "//input[@name='phone']";
	private static final String TXTEMAIL_XPATH = "//input[@id='userName']";
	private static final String TXTADDRESS_XPATH = "//input[@name='address1']";
	private static final String TXTCITY_XPATH = "//input[@name='city']";
	private static final String TXTSTATE_XPATH = "//input[@name='state']";
	private static final String TXTPOSTALCODE_XPATH = "//input[@name='postalCode']";
	private static final String SELECT_COUNTRY_XPATH = "//select[@name='country']";
	private static final String TXTUSERNAME_XPATH = "//input[@name='email']";
	private static final String TXTPASSWORD_XPATH = "//input[@name='password']";
	private static final String TXTCPASSWORD_XPATH = "//input[@name='confirmPassword']";
	private static final String BTNSUBMIT_XPATH = "//input[@name='register']";

	// FirstName
	public static WebElement getTxtName(WebDriver driver) {
		return driver.findElement(By.xpath(TXTNAME_XPATH));
	}

	public static void clickTxtName(WebDriver driver) {
		getTxtName(driver).click();
	}

	public static void inputTxtName(WebDriver driver, String data) {
		getTxtName(driver).sendKeys(data);
	}

	// LastName
	public static WebElement getTxtLastname(WebDriver driver) {
		return driver.findElement(By.xpath(TXTLASTNAME_XPATH));
	}

	public static void clickTxtLastname(WebDriver driver) {
		getTxtLastname(driver).click();
	}

	public static void inputTxtLastname(WebDriver driver, String data) {
		getTxtLastname(driver).sendKeys(data);
	}

	// Phone
	public static WebElement getPhone(WebDriver driver) {
		return driver.findElement(By.xpath(TXTPHONE_XPATH));
	}

	public static void clickPhone(WebDriver driver) {
		getPhone(driver).click();
	}

	public static void inputPhone(WebDriver driver, String data) {
		getPhone(driver).sendKeys(data);
	}

	// Email
	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(TXTEMAIL_XPATH));
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	public static void inputEmail(WebDriver driver, String data) {
		getEmail(driver).sendKeys(data);
	}

	// Address
	public static WebElement getAddress(WebDriver driver) {
		return driver.findElement(By.xpath(TXTADDRESS_XPATH));
	}

	public static void clickAddress(WebDriver driver) {
		getAddress(driver).click();
	}

	public static void inputAdress(WebDriver driver, String data) {
		getAddress(driver).sendKeys(data);
	}

	// City
	public static WebElement getCity(WebDriver driver) {
		return driver.findElement(By.xpath(TXTCITY_XPATH));
	}

	public static void clickCity(WebDriver driver) {
		getCity(driver).click();
	}

	public static void inputCity(WebDriver driver, String data) {
		getCity(driver).sendKeys(data);
	}

	// State
	public static WebElement getState(WebDriver driver) {
		return driver.findElement(By.xpath(TXTSTATE_XPATH));
	}

	public static void clickState(WebDriver driver) {
		getState(driver).click();
	}

	public static void inputState(WebDriver driver, String data) {
		getState(driver).sendKeys(data);
	}

	// PostalCode
	public static WebElement getPostalCode(WebDriver driver) {
		return driver.findElement(By.xpath(TXTPOSTALCODE_XPATH));
	}

	public static void clickPostalCode(WebDriver driver) {
		getPostalCode(driver).click();
	}

	public static void inputPostalCode(WebDriver driver, String data) {
		getPostalCode(driver).sendKeys(data);
	}
    //SelectState
	public static Select getCountry(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_COUNTRY_XPATH)));
	}

	public static void inputCountry(WebDriver driver, String data) {
		getCountry(driver).selectByVisibleText(data);
	}

	// UserName
	public static WebElement getUsername(WebDriver driver) {
		return driver.findElement(By.xpath(TXTUSERNAME_XPATH));
	}

	public static void clickUsername(WebDriver driver) {
		getUsername(driver).click();
	}

	public static void inputUsername(WebDriver driver, String data) {
		getUsername(driver).sendKeys(data);
	}

	// Password
	public static WebElement getPassword(WebDriver driver) {
		return driver.findElement(By.xpath(TXTPASSWORD_XPATH));
	}

	public static void clickPassword(WebDriver driver) {
		getPassword(driver).click();
	}

	public static void inputPassword(WebDriver driver, String data) {
		getPassword(driver).sendKeys(data);
	}

	// ConfirmPassword
	public static WebElement getCPassword(WebDriver driver) {
		return driver.findElement(By.xpath(TXTCPASSWORD_XPATH));
	}

	public static void clickCPassword(WebDriver driver) {
		getPassword(driver).click();
	}

	public static void inputCPassword(WebDriver driver, String data) {
		getCPassword(driver).sendKeys(data);
	}

	// Submit
	public static WebElement getSubmit(WebDriver driver) {
		return driver.findElement(By.xpath(BTNSUBMIT_XPATH));
	}

	public static void clickSubmit(WebDriver driver) {
		getSubmit(driver).click();
	}

}
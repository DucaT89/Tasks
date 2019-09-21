package page.objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemonautHome {
	public static final String URL="http://newtours.demoaut.com/";
	private static final String REGISTER_BUTTON_XPATH="//a[contains(text(),'REGISTER')]";
	private static final String SIGN_IN_BUTTON_XPATH="//a[contains(text(),'SIGN-ON')]";
	private static final String SUPPORT_BUTTON_XPATH="//a[contains(text(),'SUPPORT')]";
	private static final String CONTACT_BUTTON_XPATH="//a[contains(text(),'CONTACT')]";

	//private static final By REGISTER_BUTTON_LOCATOR=By.xpath("//a[contains(text(),'REGISTER')]");
	
	public static WebElement getRegisterButton(WebDriver driver) {
		return driver.findElement(By.xpath(REGISTER_BUTTON_XPATH));
	}
	public static void clickRegisterButton(WebDriver driver) {
		getRegisterButton(driver).click();
	}
	public static WebElement getSignInButton(WebDriver driver) {
		return driver.findElement(By.xpath(SIGN_IN_BUTTON_XPATH));
	}
	public static void clickSignInButton(WebDriver driver) {
		getSignInButton(driver).click();
	}
	public static WebElement getSupportButton(WebDriver driver) {
		return driver.findElement(By.xpath(SUPPORT_BUTTON_XPATH));
	}
	public static void clickSupportButton(WebDriver driver) {
		getSupportButton(driver).click();
	}
	public static WebElement getContactButton(WebDriver driver) {
		return driver.findElement(By.xpath(CONTACT_BUTTON_XPATH));
	}
	
	
	
	
	
	
	
}
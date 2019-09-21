package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.objects.DemonautHome;
import page.objects.DemonautRegister;
import utility.ExcelUtils;

public class DemonautTestNG {
  @Test
  public void testRegister() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String DATA_SOURCE="Data.xls";
		
		driver.get(DemonautHome.URL);
		
		DemonautHome.clickRegisterButton(driver);
		
		boolean rez=driver.getCurrentUrl().contains(DemonautRegister.URL);
		Assert.assertTrue(rez);
		
		ExcelUtils.setExcell(DATA_SOURCE);
		ExcelUtils.setWorkSheet("Register");
		
		String name,surname,phone,mail,address,city,postal,country,username,password;
		name=ExcelUtils.getDataAt(0,0);
		surname=ExcelUtils.getDataAt(1,0);
		phone=ExcelUtils.getDataAt(2,0);
		mail=ExcelUtils.getDataAt(3,0);
		address=ExcelUtils.getDataAt(4,0);
		city=ExcelUtils.getDataAt(5,0);
		postal=ExcelUtils.getDataAt(6,0);
		country=ExcelUtils.getDataAt(7,0);
		username=ExcelUtils.getDataAt(8,0);
		password=ExcelUtils.getDataAt(9,0);
		
		DemonautRegister.inputTxtName(driver, name);
		DemonautRegister.inputTxtLastname(driver, surname);
		DemonautRegister.inputPhone(driver, phone);
		DemonautRegister.inputEmail(driver, mail);
		DemonautRegister.inputAdress(driver, address);
		DemonautRegister.inputCity(driver, city);
		DemonautRegister.inputPostalCode(driver, postal);
		
		DemonautRegister.inputCountry(driver, country);
		
		DemonautRegister.inputUsername(driver, username);
		DemonautRegister.inputPassword(driver, password);
		DemonautRegister.inputCPassword(driver, password);
		
		DemonautRegister.clickSubmit(driver);
		
	
		driver.quit();
	
  }
}


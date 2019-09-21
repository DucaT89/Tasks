package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.DemonautHome;
import page.objects.DemonautRegister;
import utility.ExcelUtils;

public class DemonautTestRegister {
	public static boolean testRegister()  {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String DATA_SOURCE="Data.xls";
		driver.get(DemonautHome.URL);
		DemonautHome.clickRegisterButton(driver);
		if(driver.getCurrentUrl().contains(DemonautRegister.URL)==false) {
			return false;
		}
		
		ExcelUtils.setExcell(DATA_SOURCE);
		ExcelUtils.setWorkSheet("Register");
		String name,surname,phone,email,address,city,state,postal,country,username,password;
		name=ExcelUtils.getDataAt(0,0);
		surname=ExcelUtils.getDataAt(1,0);
		phone=ExcelUtils.getDataAt(2,0);
		email=ExcelUtils.getDataAt(3,0);
		address=ExcelUtils.getDataAt(4,0);
		city=ExcelUtils.getDataAt(5,0);
		state=ExcelUtils.getDataAt(6,0);
		postal=ExcelUtils.getDataAt(7,0);
		country=ExcelUtils.getDataAt(8,0);
		username=ExcelUtils.getDataAt(9,0);
        password = ExcelUtils.getDataAt(10, 0);
        
        DemonautRegister.inputTxtName(driver, name);
        DemonautRegister.inputTxtLastname(driver, surname);
        DemonautRegister.inputPhone(driver, phone);
        DemonautRegister.inputEmail(driver, email);
        DemonautRegister.inputAdress(driver, address);
        DemonautRegister.inputCity(driver, city);
        DemonautRegister.inputState(driver, state);
        DemonautRegister.inputPostalCode(driver, postal);
        
        DemonautRegister.inputCountry(driver, country);
        
		DemonautRegister.inputUsername(driver, username);
		DemonautRegister.inputPassword(driver, password);
		DemonautRegister.inputCPassword(driver, password);
		
		DemonautRegister.clickSubmit(driver);
	

		
        
		driver.quit();
		return true;
	}
}

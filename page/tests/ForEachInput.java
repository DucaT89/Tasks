package page.tests;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import page.objects.DemonautHome;
import page.objects.DemonautRegister;

public class ForEachInput {
	
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(DemonautHome.URL);
			DemonautHome.clickRegisterButton(driver);
			
			List<WebElement> elements =driver.findElements(By.tagName("input"));
			
			for(WebElement element : elements) {
				if(element.isDisplayed())
				element.sendKeys("Dobar dan");
			}
			
		
			driver.quit();
		}
		}
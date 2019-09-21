package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FillForm {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    
    WebDriver driver= new ChromeDriver();
    driver.get("http://newtours.demoaut.com");
    WebElement registrationButton=driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]"));
    registrationButton.click();
    
    WebElement nameBox=driver.findElement(By.xpath("//input[@name='firstName']"));
    nameBox.click();
    nameBox.sendKeys("Dusan");
    
    WebElement surnameBox=driver.findElement(By.xpath("//input[@name='lastName']"));
    surnameBox.click();
    surnameBox.sendKeys("tanas");
    
    WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
    phone.click();
    phone.sendKeys("06523433");
    
    WebElement email=driver.findElement(By.xpath("//input[@id='userName']"));
    email.click();
    email.sendKeys("duc@gmail.com");
    
    WebElement adress=driver.findElement(By.xpath("//input[@name='address1']"));
    adress.click();
    adress.sendKeys("ulica 9");
    
    WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
    city.click();
    city.sendKeys("bgd");
    
    WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
    state.click();
    state.sendKeys("srb");
    
    WebElement postal=driver.findElement(By.xpath("//input[@name='postalCode']"));
    postal.click();
    postal.sendKeys("11000");
    
    WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
    Select countryS = new Select(country);
    country.click();
    countryS.selectByVisibleText("UGANDA");
    
    WebElement userName=driver.findElement(By.xpath("//input[@id='email']"));
    userName.click();
    userName.sendKeys("d@gmail.com");
    
    WebElement pas=driver.findElement(By.xpath("//input[@name='password']"));
    pas.click();
    pas.sendKeys("123");
    
    WebElement pasConfirm=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
    pasConfirm.click();
    pasConfirm.sendKeys("123");
    
   
    WebElement submit=driver.findElement(By.xpath("//input[@name='register']"));
    submit.click();
   
    
    Thread.sleep(3000);
    driver.quit();
	}

}

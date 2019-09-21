
package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

		public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		    
		    WebDriver driver= new ChromeDriver();
		    driver.get("http://https://www.protonmail.com");
		    
		    WebElement LoginButton=driver.findElement(By.xpath("//a[@class='btn btn-ghost btn-short']"));
		    LoginButton.click();
		    
		    Thread.sleep(2500);
		    
		    WebElement user=driver.findElement(By.xpath("//input[@id='username']"));
		    user.click();
		    user.sendKeys("duca89@protonmail.com");
		    
		    WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		    pass.click();
		    pass.sendKeys("duca89");

		    WebElement login=driver.findElement(By.xpath("//button[@id='login_btn']"));
		    login.click();
		    
		    Thread.sleep(2500);
            driver.quit();
	}

}

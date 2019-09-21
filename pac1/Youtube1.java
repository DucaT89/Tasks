package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class Youtube1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    
	    WebDriver driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	    driver.get("https://www.youtube.com/");
	    
	    WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
	    search.click();
	    search.sendKeys("svuda grmi okolo");
	    WebElement searchButton=driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-searchbox']"));
        searchButton.click();
        
        Thread.sleep(2000);
        WebElement videoKlik=driver.findElement(By.xpath("//ytd-video-renderer[1]//div[1]//div[1]//div[1]//div[1]//h3[1]//a[1]"));
        videoKlik.click();
        
        
	    Thread.sleep(10000);
        driver.quit();
	}

}

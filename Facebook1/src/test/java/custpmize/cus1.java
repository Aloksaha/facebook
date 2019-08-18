package custpmize;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cus1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.yahoo.com");
		
		//driver.switchTo().frame(0);
		
	WebElement path=driver.findElement(By.xpath("//iframe[contains(@id,'my-adsLREC-iframe')]"));
		path.click();

	}

	
	//iframe[contains(@id,'my-adsLREC-iframe')]
}

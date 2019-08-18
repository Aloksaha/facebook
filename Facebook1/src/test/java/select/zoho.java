package select;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class zoho {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.zoho.com");

		String current=driver.getWindowHandle();
		Actions ak=new Actions(driver);
		WebElement a=driver.findElement(By.xpath("//a[@class='zh-login']"));
		ak.moveToElement(a);
		ak.click();
		ak.build().perform();
		
		WebElement loginemail=driver.findElement(By.xpath("//*[@id=\'lid\']"));
		loginemail.sendKeys("aloksaha2565@gmail.com");
		
		WebElement loginpass=driver.findElement(By.xpath("//*[@id=\'pwd\']"));
		loginpass.sendKeys("Alok2565$");	
		
		WebElement login1=driver.findElement(By.xpath("//div[@id='signin_submit']"));
		login1.click();	
		
		
		
		Set<String>win=driver.getWindowHandles();
		
		
		for(String s:win) {
			if(!s.equals(current)) {
				Thread.sleep(2000);
				driver.switchTo().window(s);
				driver.close();
			}
		}
		
		
}
	
	
	
	
	
}

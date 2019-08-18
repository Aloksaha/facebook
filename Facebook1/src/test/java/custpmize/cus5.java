package custpmize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cus5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		WebElement email=driver.findElement(By.xpath("//input[contains(@type,'email')]"));
		email.sendKeys("asdfyvwdf@bvjmc.com");
		
		WebElement pass=driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
		pass.sendKeys("bnkwdc");
		
		WebElement month=driver.findElement(By.xpath("//select[contains(@title,'Month')]"));
		Select ak=new Select(month);
		ak.selectByVisibleText("Jan");
		
		WebElement day=driver.findElement(By.xpath("//select[contains(@title,'Day')]"));
		Select ap=new Select(day);
		ap.selectByVisibleText("1");
		
		WebElement face=driver.findElement(By.xpath("//i[contains(@class,'fb_logo img sp_caECuEN6t8a sx_31fb8d')]"));
		face.click();
		
		

	}

}

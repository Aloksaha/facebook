package custpmize;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cus3 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.newyorktimes.com");
		
		WebElement clk=driver.findElements(By.xpath("//h2[contains(@class,'css-9ywo2s')]")).get(2);
		clk.click();
		
//		Actions ak=new Actions(driver);
//				
//		WebElement music=driver.findElement(By.xpath("//div[contains(@class,'spinner-3uhTwAqb')]"));
//		ak.moveToElement(music);
//		ak.click();
		
		TakesScreenshot shot=(TakesScreenshot)driver;
		File screen=shot.getScreenshotAs(OutputType.FILE);
		File target=new File("picture/al2.png");
		FileUtils.copyFile(screen, target);
		

	}

}

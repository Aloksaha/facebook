package custpmize;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cus {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.yahoo.com/");

		
		List<WebElement> links=driver.findElements(By.xpath("//*[contains(@class,'M(0) Mt(4px)')]"));
		links.get(2).click();
		
//		List<WebElement> link=driver.findElements(By.xpath("//*[contains(@class,'StretchedBox Z(1)')]"));
//		link.get(0).click();
		
		TakesScreenshot shot=(TakesScreenshot)driver;
		File screen=shot.getScreenshotAs(OutputType.FILE);
		File target=new File("picture/alok6.png");
		FileUtils.copyFile(screen, target);
		

	}
}
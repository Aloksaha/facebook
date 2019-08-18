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

public class cus2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		
		WebElement clk=driver.findElements(By.xpath("//u[contains(@class,'Pos(a)')]")).get(1);
		
		TakesScreenshot shot=(TakesScreenshot)driver;
		File screen=shot.getScreenshotAs(OutputType.FILE);
		File tareget=new File("picture/al1.png");
		FileUtils.copyFile(screen, tareget);
		
		
		clk.click();

	}

}

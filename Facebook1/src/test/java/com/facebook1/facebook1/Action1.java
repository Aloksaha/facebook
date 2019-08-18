package com.facebook1.facebook1;

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
import org.openqa.selenium.interactions.Actions;


public class Action1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.hotels.com");

		 
		Actions ak=new Actions(driver);
		
		WebElement ap=driver.findElement(By.xpath("//*[@id=\'hdr-groups\']"));
		ak.moveToElement(ap);
		ak.click();
		
		ak.build().perform();
		//ak.perform();
		
		TakesScreenshot shot=(TakesScreenshot)driver;
		File screen=shot.getScreenshotAs(OutputType.FILE);
		File target=new File("picture/alok5.png");
		FileUtils.copyFile(screen, target);
		
		
		
		//*[@id="yui_3_18_0_3_1549"]
		
		//*[@id="yui_3_18_0_3_1549 300178661_1119"]
		
		//*[@id="yui_3_18_0_3_1549 301387017_1274"]
		
		//*[@id="yui_3_18_0_3_1549 301387017_1739"]
		
		
		
		
	}

}

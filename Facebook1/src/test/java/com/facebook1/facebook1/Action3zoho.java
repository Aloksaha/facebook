package com.facebook1.facebook1;

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

public class Action3zoho {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.zoho.com");
	
		
		Actions ak=new Actions(driver);
		WebElement sign=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[5]"));
		ak.moveToElement(sign);
		ak.click();
		ak.build().perform();
		
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\'emailfield\']"));
		email.sendKeys("aloksaha2565@yahoo.com");
		
		WebElement pass=driver.findElement(By.xpath("//*[@id=\'password\']"));
		pass.sendKeys("Alok1234%");
		
		WebElement agree=driver.findElement(By.xpath("//*[@id=\"signup-termservice\"]"));
		agree.click();
		
		Actions ap=new Actions(driver);
		WebElement signup=driver.findElement(By.xpath("//*[@id=\'signupbtn\']"));
		ap.moveToElement(signup);
		ap.click();
		ap.build().perform();
		
		Actions as=new Actions(driver);
		WebElement login=driver.findElement(By.xpath("//*[@id=\'block-system-main\']/div/div[1]/span/a"));
		as.moveToElement(login);
		as.click();
		as.build().perform();
		
		WebElement loginemail=driver.findElement(By.xpath("//*[@id=\'lid\']"));
		loginemail.sendKeys("sahaalok2565@gmail.com");
		
		WebElement loginpass=driver.findElement(By.xpath("//*[@id=\'pwd\']"));
		loginpass.sendKeys("gwdcjuew");
		
		
		Actions sk=new Actions(driver);
		WebElement login1=driver.findElement(By.xpath("//*[@id=\'signin_submit\']"));
		sk.moveToElement(login1);
		sk.click();
		sk.build().perform();
		
		TakesScreenshot shot=(TakesScreenshot)driver;
		File screen=shot.getScreenshotAs(OutputType.FILE);
		
		File target=new File("picture/alok3.png");
		FileUtils.copyFile(screen, target);
		
		
		
		

	}

}

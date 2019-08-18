package com.facebook1.facebook1;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class Facetitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		WebElement ak=driver.findElement(By.xpath("//*[@id='u_0_c']"));
	
		 ak.sendKeys("alok");
	
		 WebElement ap=driver.findElement(By.xpath("//*[@id='u_0_']"));
		 ap.sendKeys("saha");
		 
		 WebElement ae=driver.findElement(By.xpath("//*[@id=\'month\']"));
		 Select set=new Select(ae);
//		 set.selectByVisibleText("Feb");
		 List<WebElement> k= set.getOptions();
		 for(WebElement z:k) {
			 String s=z.getText();
			 System.out.println(s);
		 }		 
		 setdropdown(ae,"Feb");
		 
		 
		 
		 WebElement ar=driver.findElement(By.xpath("//*[@id=\'day\']"));
		Select set1=new Select(ar);
		 List<WebElement> k1= set1.getOptions();
		 for(WebElement z1:k1) {
			 String s1=z1.getText();
			 System.out.println(s1);}
		 //set1.selectByVisibleText("23");
		 setdropdown(ar,"23");
		 
		 
		 
		 
		 WebElement at=driver.findElement(By.xpath("//*[@id=\'year\']"));
		Select set2=new Select(at);
		 List<WebElement> k2= set2.getOptions();
		 for(WebElement z2:k2) {
			 String s2=z2.getText();
			 System.out.println(s2);}
		 
		 
		 
		 
		 
		 //set2.selectByVisibleText("2019");
		 
		 WebElement at1=driver.findElement(By.xpath("//*[@id=\"u_0_s\"]/span[2]/label"));
		 at1.click();
		
		setdropdown(at,"2019");
		String title=driver.getTitle();
		System.out.println(title);
		
		String a=driver.getCurrentUrl();	
		System.out.println(a);
		
//		driver.close();
		
//		String k=driver.getPageSource();
//		System.out.println(k);
		
//		driver.quit();

	}
	public static void setdropdown(WebElement x, String y) {
		
		
		 Select set=new Select(x);
		 set.selectByVisibleText(y);
		
		
		
	}

}

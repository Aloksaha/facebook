package com.facebook1.facebook1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
			WebDriver driver1 =new ChromeDriver();
			driver1.get("http://www.facebook.com");
		
			
			WebElement id=driver1.findElement(By.xpath("//*[@id=\'email\']"));	
			id.sendKeys("sahaalok@gmail.com");
			
			WebElement pw=driver1.findElement(By.xpath("//*[@id=\'pass\']"));
			pw.sendKeys("ydnyfjs67456");
			
			WebElement Fname=driver1.findElement(By.xpath("//*[@id=\'u_0_c\']"));
			Fname.sendKeys("alok");
			
			WebElement Lname=driver1.findElement(By.xpath("//*[@id=\'u_0_e\']"));
			Lname.sendKeys("saha");	
			
			WebElement email=driver1.findElement(By.xpath("//*[@id=\'u_0_h\']"));
			email.sendKeys("3479882203");
			
			WebElement pass=driver1.findElement(By.xpath("//*[@id=\'u_0_o\']"));
			pass.sendKeys("hbhjkcie");
			
			
			
			WebElement month=driver1.findElement(By.xpath("//*[@id=\'month\']"));
			Select ak=new Select(month);
			ak.selectByVisibleText("Feb");
			
			WebElement day=driver1.findElement(By.xpath("//*[@id=\'day\']"));
			Select ap=new Select(day);
			ap.selectByVisibleText("15");
			
			WebElement year=driver1.findElement(By.xpath("//*[@id=\'year\']"));
			Select as=new Select(year);
			as.selectByVisibleText("2018");
			
			WebElement gen=driver1.findElement(By.xpath("//*[@id=\'u_0_a\']"));
			gen.click();
			
			WebElement sign=driver1.findElement(By.xpath("//*[@id=\'u_0_u\']"));
			sign.click();
			
			List<WebElement> links=driver1.findElements(By.tagName("a"));
			int total=links.size();
			System.out.println(total);
			for(WebElement e:links) {
				String link=e.getAttribute("href");
				System.out.println(link);
			}
		
			
			
			
			
driver1.close();
	}

}

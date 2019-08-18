package select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		WebElement email=driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		email.sendKeys("hdbceuren@nucn.com");

		WebElement pass=driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
		pass.sendKeys("dchjbuecei");
		
		
		WebElement month=driver.findElement(By.xpath("//select[contains(@title,'Month')]"));
		Select ak=new Select(month);
		//ak.selectByVisibleText("Jan");
		List<WebElement>ap=ak.getOptions();
		
		for(WebElement w:ap) {
			String s=w.getText();
			System.out.println(s);
		}
		
		
		WebElement day=driver.findElement(By.xpath("//select[contains(@title,'Month')]/following-sibling::*[1]"));
		Select dy=new Select(day);
		List<WebElement>ay=dy.getOptions();
		for(WebElement w1:ay) {
			String s1=w1.getText();
			System.out.println(s1);
		}
		

	}

}

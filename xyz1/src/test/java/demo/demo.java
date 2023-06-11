package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo
{

	@Test
	public void add()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,2);
		
		driver.get("https://www.facebook.com");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='12']"))));
		
		
		
		
	}
}

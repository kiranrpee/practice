package javaselenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon 
{

@Test
public void getproduct()
{
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	WebDriverWait wait=new WebDriverWait(driver,5);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	
	driver.navigate().to("https://www.amazon.in/");
	driver.navigate().refresh();
	
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	
	String parentid=driver.getWindowHandle();
	System.out.println(parentid);
	
	js.executeScript("window.scrollBy('500','500')");
	
	driver.findElement(By.xpath("(//span[text()='Apple iPhone 14 Pro (128 GB) - Silver'])[last()]")).click();
	
	 
	Set<String> ids = driver.getWindowHandles();
	 
	 for(String id:ids)
	 {
		 if(id!=parentid)
		 {
			 driver.switchTo().window(id);
			 System.out.println(driver.getTitle());
		 } 
	 }
	 
	 
	 js.executeScript("argument[0],ScrollIntoView()",driver.findElement(By.xpath("//h2[text()='Technical Details']")));
	
	
	
	
	
}
	
}

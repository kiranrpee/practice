package javaselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import xyz1.homepageamazon;
import xyz1.launch;

public class demo extends launch
{

	@Test
	public void get()
	{
		
		

		 homepageamazon hp=new homepageamazon(driver);
		 hp.search("iphone");
		 
		 
		 
	}
}

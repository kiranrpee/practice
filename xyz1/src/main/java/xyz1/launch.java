package xyz1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launch
{
	protected WebDriver driver;

	@BeforeMethod
	public void lauch1()
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 WebDriverWait wait=new WebDriverWait(driver, 2);
		 
		 driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_3c01r1321r_e&adgrpid=60612964962&hvpone=&hvptwo=&hvadid=610714031509&hvpos=&hvnetw=g&hvrand=10762053350757159157&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062048&hvtargid=kwd-32679660&hydadcr=14454_2316419");
	}
	
}

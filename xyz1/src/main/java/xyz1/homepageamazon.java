package xyz1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepageamazon
{

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement search;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement seacrchckick;

	public homepageamazon(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	public void search( String s)
	{
	
		search.sendKeys(s);
		seacrchckick.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

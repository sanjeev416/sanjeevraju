package snapdeal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Productsize extends Basepage {
	
	@FindBys(@FindBy (xpath = "//div[@id='block_top_menu']/ul/li[1]/a"))
	private WebElement Womentab;
	
	@FindBys(@FindBy(xpath = "//input[@id='layered_id_attribute_group_3']"))
	private WebElement round;
	
	public Productsize()
	
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public WebElement shape()
	
	{
	
		return Womentab;
		
	}
	
	public WebElement quality()
	
	{
		return round;
	}
	

}

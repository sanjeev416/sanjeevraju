package snapdeal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Productcount extends Basepage {
	
	@FindBys(@FindBy (xpath = "//div[@id='block_top_menu']/ul/li[1]/a"))
	private WebElement Womentab;
	
	@FindBys(@FindBy (xpath = "//span[@class='heading-counter']"))
	private WebElement items;
	
	@FindBys(@FindBy(xpath = "//div[@class='top-pagination-content clearfix']//div[@class='product-count'][contains(text(),'Showing 1 - 7 of 7 items')]"))
	private WebElement Match;
	
	
	public Productcount()
	
	{
		
		PageFactory.initElements(driver, this);
	}
	
	

	public WebElement Women()
	
	{
		return Womentab;
		
	}
	
	public WebElement count()
	
	{
		return items;
	}

	public WebElement chart()
	
	{
		
		return Match;
	}
	
	
}

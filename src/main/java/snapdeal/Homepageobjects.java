package snapdeal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Homepageobjects extends Basepage {
    
	@FindBys(@FindBy (xpath = "//div[@id='block_top_menu']/ul/li[1]/a"))
	private WebElement Womentab;

	@FindBys(@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[2]/a"))
	private WebElement Dressess;

	@FindBys(@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[3]/a"))
	private WebElement Tshirts;
	
	 	public Homepageobjects() 
    	{
		PageFactory.initElements(driver, this);

	}

	 public WebElement getwomen()
	{
		return Womentab;
	}

	public WebElement getdresses()

	{

		return Dressess;

	}
		
	public WebElement gettshirts() {
		
		return Tshirts;
		
	}
	
	

	  
}
	





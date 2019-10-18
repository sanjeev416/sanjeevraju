package snapdeal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Productspage extends Basepage {
	
	@FindBys(@FindBy (xpath = "//div[@id='block_top_menu']/ul/li[1]/a"))
	private WebElement Womentab;
	
	@FindBy(xpath = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-item-of-tablet-line']//img[@class='replace-2x img-responsive']")
	private WebElement image;
	 
    @FindBy(xpath = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-item-of-tablet-line']//span[contains(text(),'Add to cart')]")
     private WebElement size;
    
    @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    
    private WebElement verizon;
     
     
	
	
	public Productspage()
	{
 		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement gettWomebTab()
	{
		return Womentab;
	}
	
public WebElement picture()
{
	return image;
}
	
	public WebElement Addingproduct1()
	{
		return size;
		
	}
		
		
		public WebElement checkout()
		
		{
	        verizon.getText ();
			return verizon;
			
			
		}
		
	
		
		
		
	}
	
	


package snapdeal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Newsletterpage extends Basepage {
	
	@FindBy(xpath = "//*[@id='newsletter-input']")
	private WebElement email;
	
	@FindBy(xpath = "//*[@name='submitNewsletter']")
	
	private WebElement buttonclick;
	
	@FindBy(xpath = "//p[@class='alert alert-danger']")
	
	private WebElement registeration;
	
	public Newsletterpage()
	
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getsubscription()
	
	{
		setText(email, "aruna1_raj@yahoo.com");
		return email;
		
	}	
	
	
	public WebElement button()
	
	{
		buttonclick.click();
		return buttonclick;
		
		
	}
	
	public WebElement getvalidate()
	
	{
		return registeration;
	}
		
}
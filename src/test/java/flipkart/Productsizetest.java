package flipkart;

import org.testng.Assert;
import org.testng.annotations.Test;

import snapdeal.Productsize;

public class Productsizetest {
	
	Productsize pm;
	
	public Productsizetest()
	
	{
		
		pm = new Productsize();
	}
	
	
	@Test
	
	public void verifysize()
	
	{
		
		Assert.assertTrue(pm.elementFound(pm.shape()), "Failed if it is not working");
		
		pm.shape().click();
			
		pm.moveMouseCursor(pm.quality());
		pm.quality().click();
		
	}
	

}

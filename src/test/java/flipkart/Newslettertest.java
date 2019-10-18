package flipkart;

import org.testng.Assert;
import org.testng.annotations.Test;

import snapdeal.Newsletterpage;

public class Newslettertest {
	
	Newsletterpage Np;
	
public Newslettertest()

{
	
Np = new Newsletterpage();

}
	@Test
	  public void verifynews()
	  
	  {
		Assert.assertTrue(Np.elementFound(Np.getsubscription()), "Failed");
		Np.button();
		Assert.assertTrue(Np.elementFound(Np.getvalidate()), "Failed");
		Np.getTitlte().contains("already");
		  	  
	  }
		  		
}

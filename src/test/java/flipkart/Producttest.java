package flipkart;



import org.testng.annotations.Test; 

import snapdeal.Productspage;

public class Producttest {

	Productspage pp;

	public Producttest() { 

		pp = new Productspage();

	}

	@Test

	public void verifycart()

	{

		
		pp.gettWomebTab().click();
		pp.moveMouseCursor(pp.picture());
		pp.moveMouseCursor(pp.Addingproduct1());
		pp.Addingproduct1().click();
			
	}

}

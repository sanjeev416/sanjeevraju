package flipkart;

import org.testng.Assert;
import org.testng.annotations.Test;

import snapdeal.Productcount;

public class Productwebpage {

	Productcount ps;

	public Productwebpage() {

		ps = new Productcount();

	}

	@Test
	public void Verifycount() {

		
		ps.Women().click();
		ps.moveMouseCursor(ps.count());
		ps.count().click();
		ps.moveMouseCursor(ps.chart());
		ps.count().equals(ps.chart());
		Assert.assertTrue(ps.elementFound(ps.chart()), "Failed");
		

	}

}

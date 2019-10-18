package flipkart;

import org.openqa.selenium.WebElement;


import org.testng.Assert;
import org.testng.annotations.Test;

import snapdeal.Homepageobjects;

public class Homepagetest {
	 

	Homepageobjects hp;

	public Homepagetest() {

		hp = new Homepageobjects();

	}

	@Test

	public void verifywomen()

	{

		hp.getwomen().click();
		hp.getTitlte().contains("Women");
		Assert.assertTrue(hp.elementFound(hp.getwomen()), "Failed");
	}

	@Test
	public void verifydresses()

	{
		hp.getdresses().click();
		hp.getTitlte().contains("Dresses");
		Assert.assertTrue(hp.elementFound(hp.getdresses()), "Failed");
	}

	@Test
	public void verifytshirts()

	{
		
		hp.gettshirts().click();
		hp.getTitlte().contains("tshirts");
		Assert.assertTrue(hp.elementFound(hp.gettshirts()), "Failed");

	}

}

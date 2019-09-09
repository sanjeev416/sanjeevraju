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

		Assert.assertTrue(hp.elementFound(hp.getwomen()), "Failed");
		hp.getwomen().click();
		hp.getTitlte().contains("Women");
	}

	@Test(groups = ("Regression"))
	public void verifydresses()

	{
		Assert.assertTrue(hp.elementFound(hp.getdresses()), "Failed");
		hp.getdresses().click();
		hp.getTitlte().contains("Dresses");
	}

	@Test
	public void verifytshirts()

	{
		Assert.assertTrue(hp.elementFound(hp.gettshirts()), "Failed");
		hp.gettshirts().click();
		hp.getTitlte().contains("tshirts");

	}

}

package testcases;

import org.junit.Assert;
import org.junit.Test;

import base.TestBase;

public class TestCase1 extends TestBase {
	@Test
	public void t_01_check_website_is_working()
	{
		driver.get(base_url);
		String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        String actual =driver.getTitle();
        Assert.assertEquals(expected,actual);
	}

}

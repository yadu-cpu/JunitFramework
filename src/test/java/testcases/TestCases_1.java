package testcases;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import base.TestBase;
import org.junit.Assert;

public class TestCases_1 extends TestBase{
	@Before
	public void set_up() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(implicit_wait_timeout_in_sec, TimeUnit.SECONDS);
	}
	@SuppressWarnings("deprecation")
	@Test
	public void t_01_check_website_is_working() {
		driver.get(base_url);
		String expected="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actual=driver.getTitle();
		
		Assert.assertEquals(expected, actual);
	}
	@After
	public void clean_you() {
		driver.quit();
	}

}

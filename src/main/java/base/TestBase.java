package base;

import org.openqa.selenium.WebDriver;

public class TestBase {
	protected WebDriver driver;
	protected final static String base_url="http://amazon.in";
	protected final static int implicit_wait_timeout_in_sec=20;

}

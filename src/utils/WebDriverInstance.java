package utils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import testCases.LoginTestCase;

import java.util.concurrent.TimeUnit;

/**
 * 
 * @author SavannaDenega
 *
 */
public class WebDriverInstance {

	protected static WebDriver driver = null;
	protected static String baseUrl = System.getProperty("baseUrl",
			"http://opensource.demo.orangehrmlive.com/index.php/admin/viewAdminModule");

	static LoginTestCase loginTestCase = PageFactory.initElements(driver, LoginTestCase.class);
	
	@BeforeClass
	public static void setUp() throws Exception {
		driver = WebDriverFactoryInstance.getInstance().createConfigurationsWebDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.get(baseUrl);
		loginTestCase.login();
	}

//	@AfterClass
//	public static void tearDown() throws Exception {
//		driver.close();
//		driver.quit();
//	}
	
	public static void sleep(int time){
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

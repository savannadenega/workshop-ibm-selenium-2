package testCases;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.support.PageFactory;

import utils.WebDriverInstance;
import objects.LoginObjs;

/**
 * 
 * @author SavannaDenega
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTestCase extends WebDriverInstance {

	LoginObjs loginObjs = PageFactory.initElements(driver, LoginObjs.class);

	@Test
	public void login() {
		sleep(1000);
		loginObjs.textAdmin(driver).sendKeys("Admin");
		loginObjs.textPassword(driver).sendKeys("admin");
		loginObjs.buttonLogin(driver).click();
	}

}

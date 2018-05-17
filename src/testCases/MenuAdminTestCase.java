package testCases;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.support.PageFactory;

import objects.MenuAdminObjs;
import utils.WebDriverInstance;

/**
 * 
 * @author SavannaDenega
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MenuAdminTestCase extends WebDriverInstance {

	LoginTestCase loginTestCase = PageFactory.initElements(driver, LoginTestCase.class);
	MenuAdminObjs menuAdminObjs = PageFactory.initElements(driver, MenuAdminObjs.class);
		
	@Before
	public void before() throws InterruptedException {
		loginTestCase.login();
		menuAdminObjs.bottonMenuAdmin(driver).click();
	}
	
	@Test
	public void insertUser() throws InterruptedException {
		Thread.sleep(1000);
		menuAdminObjs.bottonAdd(driver).click();
		menuAdminObjs.textEmployeeName(driver).sendKeys("Savanna Denega");
		menuAdminObjs.textUsername(driver).sendKeys("savannadenega");
		menuAdminObjs.textPassword(driver).sendKeys("savannadenega");
		menuAdminObjs.textConfirmPassword(driver).sendKeys("savannadenega");
	}
	
}

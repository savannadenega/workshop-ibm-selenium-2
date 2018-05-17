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

	MenuAdminObjs menuAdminObjs = PageFactory.initElements(driver, MenuAdminObjs.class);
		
	@Before
	public void before() throws InterruptedException {
		menuAdminObjs.bottonMenuAdmin(driver).click();
	}
	
	@Test
	public void insertUserLogin() {
		sleep(1000);
		menuAdminObjs.bottonAdd(driver).click();
		sleep(1000);
		menuAdminObjs.textEmployeeName(driver).sendKeys("Savanna Denega");
		sleep(1000);
		menuAdminObjs.textUsername(driver).sendKeys("savannadenega1");
		sleep(1000);
		menuAdminObjs.textPassword(driver).sendKeys("savannadenega1");
		sleep(1000);
		menuAdminObjs.textConfirmPassword(driver).sendKeys("savannadenega1");
		sleep(1000);
		menuAdminObjs.bottonSave(driver).click();
	}
	
}

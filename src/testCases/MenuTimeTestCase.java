package testCases;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.support.PageFactory;

import objects.MenuTimeObjs;
import utils.WebDriverInstance;

/**
 * 
 * @author SavannaDenega
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MenuTimeTestCase extends WebDriverInstance {

	MenuTimeObjs menuTimeObjs = PageFactory.initElements(driver, MenuTimeObjs.class);
	
	@Before
	public void before() {
		menuTimeObjs.bottonMenuTime(driver).click();
	}
	
	@Test
	public void searchUser(){
		sleep(1000);
		menuTimeObjs.textEmployeeName(driver).click();
		sleep(1000);
		menuTimeObjs.textEmployeeName(driver).sendKeys("Savanna Denega");
		sleep(1000);
		menuTimeObjs.buttonView(driver).click();
	}

}

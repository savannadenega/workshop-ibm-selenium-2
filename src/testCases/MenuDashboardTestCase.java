package testCases;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import objects.MenuAdminObjs;
import objects.MenuDashboardObjs;
import utils.WebDriverInstance;

public class MenuDashboardTestCase extends WebDriverInstance {
	
	LoginTestCase loginTestCase = PageFactory.initElements(driver, LoginTestCase.class);
	MenuDashboardObjs menuDashboardObjs = PageFactory.initElements(driver, MenuDashboardObjs.class);
	
	@Before
	public void before() throws InterruptedException {
		loginTestCase.login();
		menuDashboardObjs.buttonMenuDashboard(driver).click();
	}
	
	@Test
	public void timeSheetAdd() throws InterruptedException {
		Thread.sleep(1000);
		menuDashboardObjs.buttonAddTimeSheet(driver).click();
		//ExpectedConditions.presenceOfAllElementsLocatedBy(id)
		menuDashboardObjs.buttonTimeSheet(driver).click();

	}

}

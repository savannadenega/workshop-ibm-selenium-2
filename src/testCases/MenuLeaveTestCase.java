package testCases;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import objects.MenuLeaveObjs;
import utils.WebDriverInstance;

/**
 * 
 * @author SavannaDenega
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MenuLeaveTestCase extends WebDriverInstance {

	MenuLeaveObjs menuLeaveObjs = PageFactory.initElements(driver, MenuLeaveObjs.class);
	
	@Before
	public void before(){
		menuLeaveObjs.buttonMenuLeave(driver).click();
	}
	
	@Test
	public void addLeaveEntitlement(){
		sleep(1000);
		menuLeaveObjs.buttonSubMenuEntitlements(driver).click();
		sleep(1000);
		menuLeaveObjs.buttonSubMenuAddEntitlements(driver).click();
		sleep(1000);
		menuLeaveObjs.textEmployee(driver).sendKeys("Savanna Denega");
		menuLeaveObjs.textEmployee(driver).sendKeys(Keys.RETURN);
		sleep(1000);
		menuLeaveObjs.comboBoxLeaveType(driver).click();
		sleep(1000);
		menuLeaveObjs.comboBoxLeaveType(driver).sendKeys("Vacation US");
		sleep(1000);
		menuLeaveObjs.textEntitlement(driver).sendKeys("1");
		sleep(1000);
		menuLeaveObjs.buttonSave(driver).click();
		sleep(1000);
	}
	
	@Test
	public void createAssignLeave(){
		sleep(1000);
		menuLeaveObjs.buttonSubMenuAssignLeave(driver).click();
		sleep(1000);
		menuLeaveObjs.textSubMenuAssignLeaveEmployeeName(driver).sendKeys("Savanna Denega");
		sleep(1000);
		menuLeaveObjs.comboBoxSubMenuAssignLeaveLeaveType(driver).click();
		sleep(1000);
		menuLeaveObjs.comboBoxSubMenuAssignLeaveLeaveType(driver).sendKeys("Vacation US");
		sleep(1000);
		menuLeaveObjs.textSubMenuAssignLeaveFromDate(driver).click();
		sleep(1000);
		menuLeaveObjs.textSubMenuAssignLeaveFromDate(driver).sendKeys("2018-05-18");
		sleep(1000);
		menuLeaveObjs.textSubMenuAssignLeaveFromDate(driver).sendKeys(Keys.RETURN);
		sleep(1000);
		menuLeaveObjs.buttonSubMenuAssignLeaveAssignBtn(driver).click();
		sleep(1000);
	}

}

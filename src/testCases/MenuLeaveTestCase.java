package testCases;

import javax.swing.plaf.MenuItemUI;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import objects.MenuAdminObjs;
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
		menuLeaveObjs.bottonMenuLeave(driver).click();
	}
	
	@Test
	@Ignore
	public void add1LeaveEntitlement(){
		sleep(1000);
		menuLeaveObjs.bottonSubMenuEntitlements(driver).click();
		sleep(1000);
		menuLeaveObjs.bottonSubMenuAddEntitlements(driver).click();
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
		menuLeaveObjs.bottonSave(driver).click();
		sleep(1000);
	}
	
	@Test
	public void add2AssignLeave(){
		sleep(1000);
		menuLeaveObjs.bottonSubMenuAssignLeave(driver).click();
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
		menuLeaveObjs.bottonSubMenuAssignLeaveAssignBtn(driver).click();
		sleep(1000);
	}

}

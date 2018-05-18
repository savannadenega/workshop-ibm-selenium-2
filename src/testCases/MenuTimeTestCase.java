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
		menuTimeObjs.buttonMenuTime(driver).click();
	}
	
	@Test
	public void searchUser(){
//		sleep(1000);
//		if(menuTimeObjs.buttonTimesheetPeriodTimeStartingDays(driver).isEnabled()){
//			menuTimeObjs.buttonTimesheetPeriodTimeStartingDays(driver).click();
//			sleep(1000);
//			menuTimeObjs.buttonTimesheetPeriodTimeStartingDays(driver).sendKeys("Monday");
//			sleep(1000);
//			menuTimeObjs.buttonTimesheetPeriodSave(driver).click();
//		}
		sleep(1000);
		menuTimeObjs.buttonSubMenuAttendance(driver).click();
		sleep(1000);
		menuTimeObjs.buttonSubMenuConfiguration(driver).click();
		sleep(1000);
		menuTimeObjs.checkBoxAttendanceConfiguration1(driver).click();
		sleep(1000);
		menuTimeObjs.checkBoxAttendanceConfiguration2(driver).click();
		sleep(1000);
		menuTimeObjs.checkBoxAttendanceConfiguration3(driver).click();
		sleep(1000);
		menuTimeObjs.buttonSave(driver).click();
	}
}

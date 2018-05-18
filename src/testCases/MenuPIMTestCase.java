package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.junit.runners.MethodSorters;

import objects.MenuPIMObjs;
import utils.WebDriverInstance;

/**
 * 
 * @author SavannaDenega
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MenuPIMTestCase extends WebDriverInstance {

	MenuPIMObjs menuPIMObjsObjs = PageFactory.initElements(driver, MenuPIMObjs.class);
		
	@Before
	public void before() {
		menuPIMObjsObjs.bottonMenuPIM(driver).click();
	}
	
	@Test
	public void insertUser(){
		sleep(3000);
		menuPIMObjsObjs.bottonSubMenuPIMAddEmployee(driver).click();
		sleep(3000);
		menuPIMObjsObjs.textAddEmployeeFirstName(driver).sendKeys("Savanna");
		sleep(3000);
		menuPIMObjsObjs.textAddEmployeeLastName(driver).sendKeys("Denega");
		sleep(3000);
		menuPIMObjsObjs.bottonAddEmployeeSave(driver).click();
		sleep(5000);
	}
	
	@Test
	public void searchUser(){
		sleep(5000);
		menuPIMObjsObjs.bottonMenuPIM(driver).click();
		sleep(3000);
		menuPIMObjsObjs.bottonSubMenuPIMEmployeeList(driver).click();
		sleep(3000);
		menuPIMObjsObjs.textSearchEmployeeName(driver).sendKeys("Savanna Denega");
		sleep(3000);
		menuPIMObjsObjs.textSearchEmployeeName(driver).sendKeys(Keys.RETURN);
		sleep(3000);
		menuPIMObjsObjs.bottonSearchSearch(driver).click();
		sleep(3000);
	}
	
}

package testCases;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

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
		menuPIMObjsObjs.buttonMenuPIM(driver).click();
	}
	
	@Test
	public void addEmployee(){
		sleep(3000);
		menuPIMObjsObjs.buttonSubMenuPIMAddEmployee(driver).click();
		sleep(3000);
		menuPIMObjsObjs.textAddEmployeeFirstName(driver).sendKeys("Savanna");
		sleep(3000);
		menuPIMObjsObjs.textAddEmployeeLastName(driver).sendKeys("Denega");
		sleep(3000);
		menuPIMObjsObjs.buttonAddEmployeeSave(driver).click();
		sleep(5000);
	}
	
	@Test
	public void searchEmployee(){
		sleep(5000);
		menuPIMObjsObjs.buttonMenuPIM(driver).click();
		sleep(3000);
		menuPIMObjsObjs.buttonSubMenuPIMEmployeeList(driver).click();
		sleep(3000);
		menuPIMObjsObjs.textSearchEmployeeName(driver).sendKeys("Savanna Denega");
		sleep(3000);
		menuPIMObjsObjs.textSearchEmployeeName(driver).sendKeys(Keys.RETURN);
		sleep(3000);
		menuPIMObjsObjs.buttonSearchSearch(driver).click();
		sleep(3000);
	}
	
}

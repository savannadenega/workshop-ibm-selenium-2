package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author SavannaDenega
 *
 */
public class MenuPIMObjs {
	
	public WebElement bottonMenuPIM(WebDriver driver) {
		String id = "menu_pim_viewPimModule";
		return driver.findElement(By.id(id));
	}
	
	/////
	
	public WebElement bottonSubMenuPIMAddEmployee(WebDriver driver) {
		String id = "menu_pim_addEmployee";
		return driver.findElement(By.id(id));
	}
	
	public WebElement bottonAddEmployeeAdd(WebDriver driver) {
		String id = "btnAdd";
		return driver.findElement(By.id(id));
	}
	
	public WebElement textAddEmployeeFirstName(WebDriver driver) {
		String name = "firstName";
		return driver.findElement(By.name(name));
	}
	
	public WebElement textAddEmployeeLastName(WebDriver driver) {
		String id = "lastName";
		return driver.findElement(By.id(id));
	}
	
	public WebElement bottonAddEmployeeSave(WebDriver driver) {
		String id = "btnSave";
		return driver.findElement(By.id(id));
	}

	////
	
	public WebElement bottonSubMenuPIMEmployeeList(WebDriver driver) {
		String id = "menu_pim_viewEmployeeList";
		return driver.findElement(By.id(id));
	}
	
	public WebElement textSearchEmployeeName(WebDriver driver) {
		String id = "empsearch_employee_name_empName";
		return driver.findElement(By.id(id));
	}
	
	public WebElement bottonSearchSearch(WebDriver driver) {
		String id = "searchBtn";
		return driver.findElement(By.id(id));
	}
	
}

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
	
	public WebElement buttonMenuPIM(WebDriver driver) {
		String id = "menu_pim_viewPimModule";
		return driver.findElement(By.id(id));
	}
	
	//
	
	public WebElement buttonSubMenuPIMAddEmployee(WebDriver driver) {
		String id = "menu_pim_addEmployee";
		return driver.findElement(By.id(id));
	}
	
	public WebElement buttonAddEmployeeAdd(WebDriver driver) {
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
	
	public WebElement buttonAddEmployeeSave(WebDriver driver) {
		String id = "btnSave";
		return driver.findElement(By.id(id));
	}

	//
	
	public WebElement buttonSubMenuPIMEmployeeList(WebDriver driver) {
		String id = "menu_pim_viewEmployeeList";
		return driver.findElement(By.id(id));
	}
	
	public WebElement textSearchEmployeeName(WebDriver driver) {
		String id = "empsearch_employee_name_empName";
		return driver.findElement(By.id(id));
	}
	
	public WebElement buttonSearchSearch(WebDriver driver) {
		String id = "searchBtn";
		return driver.findElement(By.id(id));
	}
	
}

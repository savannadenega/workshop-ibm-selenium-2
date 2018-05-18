package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author SavannaDenega
 *
 */
public class MenuLeaveObjs {

	public WebElement buttonMenuLeave(WebDriver driver) {
		String id = "menu_leave_viewLeaveModule";
		return driver.findElement(By.id(id));
	}
	
	public WebElement buttonSubMenuEntitlements(WebDriver driver) {
		String id = "menu_leave_Entitlements";
		return driver.findElement(By.id(id));
	}
	
	public WebElement buttonSubMenuAddEntitlements(WebDriver driver) {
		String id = "menu_leave_addLeaveEntitlement";
		return driver.findElement(By.id(id));
	}
	
	public WebElement textEmployee(WebDriver driver) {
		String id = "entitlements_employee_empName";
		return driver.findElement(By.id(id));
	}
	
	public WebElement comboBoxLeaveType(WebDriver driver) {
		String id = "entitlements_leave_type";
		return driver.findElement(By.id(id));
	}
	
	public WebElement textEntitlement(WebDriver driver) {
		String id = "entitlements_entitlement";
		return driver.findElement(By.id(id));
	}
	
	public WebElement buttonSave(WebDriver driver) {
		String id = "btnSave";
		return driver.findElement(By.id(id));
	}
	
	//
	
	public WebElement buttonSubMenuAssignLeave(WebDriver driver) {
		String id = "menu_leave_assignLeave";
		return driver.findElement(By.id(id));
	}	
	
	public WebElement textSubMenuAssignLeaveEmployeeName(WebDriver driver) {
		String id = "assignleave_txtEmployee_empName";
		return driver.findElement(By.id(id));
	}
	
	public WebElement comboBoxSubMenuAssignLeaveLeaveType(WebDriver driver) {
		String id = "assignleave_txtLeaveType";
		return driver.findElement(By.id(id));
	}
	
	public WebElement textSubMenuAssignLeaveFromDate(WebDriver driver) {
		String id = "assignleave_txtFromDate";
		return driver.findElement(By.id(id));
	}
	
	public WebElement textSubMenuAssignLeaveToDate(WebDriver driver) {
		String id = "assignleave_txtToDate";
		return driver.findElement(By.id(id));
	}
	
	public WebElement buttonSubMenuAssignLeaveAssignBtn(WebDriver driver) {
		String id = "assignBtn";
		return driver.findElement(By.id(id));
	}
	
}

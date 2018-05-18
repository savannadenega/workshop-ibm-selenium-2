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

	public WebElement bottonMenuLeave(WebDriver driver) {
		String id = "menu_leave_viewLeaveModule";
		return driver.findElement(By.id(id));
	}
	
	public WebElement bottonSubMenuEntitlements(WebDriver driver) {
		String id = "menu_leave_Entitlements";
		return driver.findElement(By.id(id));
	}
	
	public WebElement bottonSubMenuAddEntitlements(WebDriver driver) {
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
	
	public WebElement bottonSave(WebDriver driver) {
		String id = "btnSave";
		return driver.findElement(By.id(id));
	}
	
	//
	
	public WebElement bottonSubMenuAssignLeave(WebDriver driver) {
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
	
	public WebElement bottonSubMenuAssignLeaveAssignBtn(WebDriver driver) {
		String id = "assignBtn";
		return driver.findElement(By.id(id));
	}
	
}

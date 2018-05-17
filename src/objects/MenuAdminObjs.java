package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author SavannaDenega
 *
 */
public class MenuAdminObjs {

	public WebElement bottonMenuAdmin(WebDriver driver) {
		String id = "menu_admin_viewAdminModule";
		return driver.findElement(By.id(id));
	}
		
	public WebElement bottonAdd(WebDriver driver) {
		String id = "btnAdd";
		return driver.findElement(By.id(id));
	}
	
	public WebElement textEmployeeName(WebDriver driver) {
		String id = "systemUser_employeeName_empName";
		return driver.findElement(By.id(id));
	}
	
	public WebElement textUsername(WebDriver driver) {
		String id = "systemUser_userName";
		return driver.findElement(By.id(id));
	}
	
	public WebElement textPassword(WebDriver driver) {
		String id = "systemUser_password";
		return driver.findElement(By.id(id));
	}
	
	public WebElement textConfirmPassword(WebDriver driver) {
		String id = "systemUser_confirmPassword";
		return driver.findElement(By.id(id));
	}
	
	public WebElement bottonSave(WebDriver driver) {
		String id = "btnSave";
		return driver.findElement(By.id(id));
	}
	
}

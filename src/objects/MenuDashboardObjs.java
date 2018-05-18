package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuDashboardObjs {
	
	public WebElement buttonMenuDashboard(WebDriver driver) {
		String id = "menu_dashboard_index";
		return driver.findElement(By.id(id));
	}
	
	public WebElement buttonTimeSheet(WebDriver driver) {
		String linkText = "/index.php/time/viewEmployeeTimesheet";
		return driver.findElement(By.xpath(linkText));
	}
	
	public WebElement employeeName(WebDriver driver) {
		String id = "employee";
		return driver.findElement(By.id(id));
	}
	
	public WebElement buttonAddTimeSheet(WebDriver driver) {
		String id = "btnAddTimesheet";
		return driver.findElement(By.id(id));
	}
	
	public WebElement timeDate(WebDriver driver) {
		String id = "time_date";
		return driver.findElement(By.id(id));
	}
	
	public WebElement buttonEdit(WebDriver driver) {
		String id = "btnEdit";
		return driver.findElement(By.id(id));
	}
	
	public WebElement projectName(WebDriver driver) {
		String id = "initialRows_0_projectName";
		return driver.findElement(By.id(id));
	}
	
	public WebElement comboActivityName(WebDriver driver) {
		String id = "initialRows_0_projectActivityName";
		return driver.findElement(By.id(id));
	}
	
	public WebElement mon14(WebDriver driver) {
		String id = "initialRows_0_0";
		return driver.findElement(By.id(id));
	}
	
	public WebElement buttonSave(WebDriver driver) {
		String id = "submitSave";
		return driver.findElement(By.id(id));
	}

}

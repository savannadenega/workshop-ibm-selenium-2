package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author SavannaDenega
 *
 */
public class MenuTimeObjs {

	public WebElement buttonMenuTime(WebDriver driver) {
		String id = "menu_time_viewTimeModule";
		return driver.findElement(By.id(id));
	}
	
	//
		
	public WebElement buttonTimesheetPeriodTimeStartingDays(WebDriver driver) {
		String id = "time_startingDays";
		return driver.findElement(By.id(id));
	}
	
	public WebElement buttonTimesheetPeriodSave(WebDriver driver) {
		String id = "btnSave";
		return driver.findElement(By.id(id));
	}
	
	//
	
	public WebElement buttonSubMenuAttendance(WebDriver driver) {
		String id = "menu_attendance_Attendance";
		return driver.findElement(By.id(id));
	}
	
	public WebElement buttonSubMenuConfiguration(WebDriver driver) {
		String id = "menu_attendance_configure";
		return driver.findElement(By.id(id));
	}
	
	public WebElement checkBoxAttendanceConfiguration1(WebDriver driver) {
		String id = "attendance_configuration1";
		return driver.findElement(By.id(id));
	}
	
	public WebElement checkBoxAttendanceConfiguration2(WebDriver driver) {
		String id = "attendance_configuration2";
		return driver.findElement(By.id(id));
	}
	
	public WebElement checkBoxAttendanceConfiguration3(WebDriver driver) {
		String id = "attendance_configuration3";
		return driver.findElement(By.id(id));
	}
	
	public WebElement buttonSave(WebDriver driver) {
		String id = "btnSave";
		return driver.findElement(By.id(id));
	}

}

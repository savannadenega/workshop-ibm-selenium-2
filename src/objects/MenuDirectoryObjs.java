package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuDirectoryObjs {
	public WebElement buttonMenuDirectory(WebDriver driver) {
		String id = "menu_directory_viewDirectory";
		return driver.findElement(By.id(id));
	}
	
	public WebElement searchName(WebDriver driver) {
		String id = "searchDirectory_emp_name_empName";
		return driver.findElement(By.id(id));
	}
	
	public WebElement comboJobTitle(WebDriver driver) {
		String id = "searchDirectory_job_title";
		return driver.findElement(By.id(id));
	}
	
	public WebElement comboLocation(WebDriver driver) {
		String id = "searchDirectory_location";
		return driver.findElement(By.id(id));
	}
	
	public WebElement buttonSearch(WebDriver driver) {
		String id = "searchBtn";
		return driver.findElement(By.id(id));
	}


}

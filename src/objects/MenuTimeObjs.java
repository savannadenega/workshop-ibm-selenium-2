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

	public WebElement bottonMenuTime(WebDriver driver) {
		String id = "menu_time_viewTimeModule";
		return driver.findElement(By.id(id));
	}
	
	public WebElement textEmployeeName(WebDriver driver) {
		String id = "employee";
		return driver.findElement(By.id(id));
	}
	
	public WebElement buttonView(WebDriver driver) {
		String id = "btnView";
		return driver.findElement(By.id(id));
	}


}

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

	public WebElement bottonMenuAdmin(WebDriver driver) {
		String id = "menu_admin_viewAdminModule";
		return driver.findElement(By.id(id));
	}

}

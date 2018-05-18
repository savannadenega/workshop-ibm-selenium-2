package testCases;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import objects.MenuDirectoryObjs;
import utils.WebDriverInstance;

public class MenuDirectoryTestCase extends WebDriverInstance {
	
	MenuDirectoryObjs menuDirectoryObjs = PageFactory.initElements(driver, MenuDirectoryObjs.class);
	
	@Before
	public void before() throws InterruptedException {
		menuDirectoryObjs.buttonMenuDirectory(driver).click();
	}
	
	@Test
	public void searchForLinda() throws InterruptedException {
		Thread.sleep(1000);
		menuDirectoryObjs.searchName(driver).sendKeys("Linda Anderson");
		
		menuDirectoryObjs.comboJobTitle(driver).click();
		menuDirectoryObjs.comboJobTitle(driver).sendKeys("HR Manager");
		menuDirectoryObjs.comboJobTitle(driver).sendKeys(Keys.RETURN);
		
		menuDirectoryObjs.comboLocation(driver).click();
		menuDirectoryObjs.comboLocation(driver).sendKeys("Texas R&D");
		menuDirectoryObjs.comboLocation(driver).sendKeys(Keys.RETURN);
		
		menuDirectoryObjs.buttonSearch(driver).click();
	}
	}
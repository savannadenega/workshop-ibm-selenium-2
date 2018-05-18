package testCases;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import objects.MenuDirectoryObjs;
import utils.WebDriverInstance;

public class MenuDirectoryTestCase extends WebDriverInstance {
	
	LoginTestCase loginTestCase = PageFactory.initElements(driver, LoginTestCase.class);
	MenuDirectoryObjs menuDirectoryObjs = PageFactory.initElements(driver, MenuDirectoryObjs.class);
	
	@Before
	public void before() throws InterruptedException {
		loginTestCase.login();
		menuDirectoryObjs.buttonMenuDirectory(driver).click();
	}
	
	@Test
	public void timeSheetAdd() throws InterruptedException {
		Thread.sleep(1000);
	}
	}
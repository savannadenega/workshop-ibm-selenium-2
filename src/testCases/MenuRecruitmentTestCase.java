package testCases;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import objects.MenuRecruitmentObjs;
import utils.WebDriverInstance;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MenuRecruitmentTestCase extends WebDriverInstance {

	MenuRecruitmentObjs menuRecruitmentObjs = PageFactory.initElements(driver, MenuRecruitmentObjs.class);

	@Before
	public void before() {
		menuRecruitmentObjs.buttonMenuRecruitment(driver).click();
	}
	
	@Test
	public void addRecruitment() throws InterruptedException {
		menuRecruitmentObjs.buttonAdd(driver).click();
		menuRecruitmentObjs.candidateFirstName(driver).sendKeys("Ana");
		menuRecruitmentObjs.candidateLastName(driver).sendKeys("da Silva");
		menuRecruitmentObjs.candidateEmail(driver).sendKeys("anadasilva@ana.com.br");
		menuRecruitmentObjs.comboCandidateVacancy(driver).click();
		menuRecruitmentObjs.comboCandidateVacancy(driver).sendKeys("tester");
		menuRecruitmentObjs.comboCandidateVacancy(driver).sendKeys(Keys.RETURN);
		menuRecruitmentObjs.buttonSave(driver).click();
		
	
	}

	@Test
	public void searchRecruitment() throws InterruptedException {
		Thread.sleep(2000);
		menuRecruitmentObjs.comboJobTitle(driver).click();
		menuRecruitmentObjs.comboJobTitle(driver).sendKeys("All");
		menuRecruitmentObjs.comboJobTitle(driver).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		menuRecruitmentObjs.comboVacancy(driver).click();
		menuRecruitmentObjs.comboVacancy(driver).sendKeys("All");
		menuRecruitmentObjs.comboVacancy(driver).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		menuRecruitmentObjs.comboHiringManager(driver).click();
		menuRecruitmentObjs.comboHiringManager(driver).sendKeys("All");
		menuRecruitmentObjs.comboHiringManager(driver).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		menuRecruitmentObjs.comboHiringManager(driver).click();
		menuRecruitmentObjs.comboHiringManager(driver).sendKeys("All");
		menuRecruitmentObjs.comboHiringManager(driver).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		menuRecruitmentObjs.comboStatus(driver).click();
		menuRecruitmentObjs.comboStatus(driver).sendKeys("All");
		menuRecruitmentObjs.comboStatus(driver).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		menuRecruitmentObjs.candidateName(driver).sendKeys("Ana da Silva");
		
		
	
	}

}
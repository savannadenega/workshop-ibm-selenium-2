package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuRecruitmentObjs {
	
	public WebElement buttonMenuRecruitment(WebDriver driver) {
		String id = "menu_recruitment_viewRecruitmentModule";
		return driver.findElement(By.id(id));
	}
	
	public WebElement comboJobTitle(WebDriver driver) {
		String id = "candidateSearch_jobTitle";
		return driver.findElement(By.id(id));
	}
	
	public WebElement comboVacancy(WebDriver driver) {
		String id = "candidateSearch_jobVacancy";
		return driver.findElement(By.id(id));
	}
	
	public WebElement comboHiringManager(WebDriver driver) {
		String id = "candidateSearch_hiringManager";
		return driver.findElement(By.id(id));
	}
	
	public WebElement comboStatus(WebDriver driver) {
		String id = "candidateSearch_status";
		return driver.findElement(By.id(id));
	}
	
	public WebElement candidateName(WebDriver driver) {
		String id = "candidateSearch_candidateName";
		return driver.findElement(By.id(id));
	}
	
	public WebElement searchFromDate(WebDriver driver) {
		String id = "candidateSearch_fromDate";
		return driver.findElement(By.id(id));
	}
	
	public WebElement searchToDate(WebDriver driver) {
		String id = "candidateSearch_toDate";
		return driver.findElement(By.id(id));
	}
	
	public WebElement bottonSearchSearch(WebDriver driver) {
		String id = "searchBtn";
		return driver.findElement(By.id(id));
	}
	
}

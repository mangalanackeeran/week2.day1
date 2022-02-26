package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		WebElement elementUserName = driver.findElement(By.id("username"));
		elementUserName.sendKeys("Demosalesmanager");

		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");

		WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
		elementLoginButton.click();

		WebElement elementCRF_SFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRF_SFA.click();

		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();

		WebElement elementCreateLeads = driver.findElement(By.linkText("Create Lead"));
		elementCreateLeads.click();

		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("Quartesian");

		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("tyyti");

		WebElement elementLatName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLatName.sendKeys("yuity");

		WebElement elementFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementFirstNameLocal.sendKeys("yuity");

		WebElement elementDepartment = driver.findElement(By.id("createLeadForm_departmentName"));
		elementDepartment.sendKeys("IT");

		WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("yuity");

		WebElement elementemail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementemail.sendKeys("yuity@gmail.com");

		WebElement elementstate = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(elementstate);
		dd.selectByVisibleText("New York");

		WebElement elementCreateLead_submit = driver.findElement(By.className("smallSubmit"));
		elementCreateLead_submit.click();

		WebElement elementEdit = driver.findElement(By.linkText("Edit"));
		elementEdit.click();

		driver.findElement(By.id("updateLeadForm_description")).clear();

		WebElement elementImportNote = driver.findElement(By.id("updateLeadForm_importantNote"));
		elementImportNote.sendKeys("test");

		WebElement elementUpdate = driver.findElement(By.className("smallSubmit"));
		elementUpdate.click();

		System.out.println(driver.getTitle());

	}

}

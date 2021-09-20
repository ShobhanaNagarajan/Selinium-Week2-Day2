package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();	
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 

			
			WebElement usernameBox = driver.findElement(By.id("username"));
			usernameBox.sendKeys("demosalesmanager");
			
			WebElement passwordBox = driver.findElement(By.id("password"));
			passwordBox.sendKeys("crmsfa");
			
			WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
			loginButton.click();
			System.out.println(driver.getTitle());
			
			WebElement crmsfaHyperLink = driver.findElement(By.linkText("CRM/SFA"));
			crmsfaHyperLink.click();
			System.out.println(driver.getTitle());
			
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			System.out.println(driver.getTitle());
			
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shobhi");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Nagaraj");
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms.");
			driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("18/04/93");
			driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("M.E");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Testing");
			
			WebElement SourceDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
			Select source = new Select(SourceDropDown);
			source.selectByValue("LEAD_EMPLOYEE");
			
			WebElement industryDropdown = driver.findElement(By.id("createLeadForm_industryEnumId"));
			Select Industry = new Select(industryDropdown);
			Industry.selectByVisibleText("Manufacturing");
			
			WebElement ownershipDropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			Select Ownership = new Select(ownershipDropdown);
			Ownership.selectByIndex(1);
			
			
			WebElement stateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select State = new Select(stateDropdown);
			State.selectByVisibleText("Florida");
	
	
			WebElement countryDropdown = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
			Select Country = new Select(countryDropdown);
			Country.selectByValue("IND");
	
	
			driver.findElement(By.name("submitButton")).click();
			System.out.println(driver.getTitle());
	
	}
	
	
	

}

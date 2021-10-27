package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();	
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		WebElement usernameBox = driver.findElement(By.id("username"));
		usernameBox.sendKeys("demosalesmanager");
		
		WebElement passwordBox = driver.findElement(By.id("password"));
		passwordBox.sendKeys("crmsfa");
		
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();

		WebElement crmsfaHyperLink = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaHyperLink.click();
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Shobhana");
		driver.findElement(By.id("lastNameField")).sendKeys("Nagaraj");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Software Testing");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("shophiyarajan.com");
		
		
		WebElement countryCode = driver.findElement(By.id("createContactForm_primaryPhoneCountryCode"));
		countryCode.sendKeys("91");
		
		driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys("8870184932");
		driver.findElement(By.id("createContactForm_primaryPhoneAreaCode")).sendKeys("05");
		driver.findElement(By.id("createContactForm_primaryPhoneAskForName")).sendKeys("Shobi");
		driver.findElement(By.id("createContactForm_primaryPhoneExtension")).sendKeys("001");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("shophiya18@gmail.com");
		driver.findElement(By.id("generalToNameField")).clear();
		driver.findElement(By.id("generalToNameField")).sendKeys("Shobi Nagaraj");
		driver.findElement(By.id("createContactForm_generalAttnName")).sendKeys("SBI colony");
		driver.findElement(By.id("createContactForm_generalAddress1")).sendKeys("Bharathipuram");
		driver.findElement(By.id("createContactForm_generalAddress2")).sendKeys("Dharmapuri");
		
		WebElement countryDropdown = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
		Select Country = new Select(countryDropdown);
		Country.selectByValue("USA");
		
		WebElement stateDropdown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select State = new Select(stateDropdown);
		State.selectByValue("NY");
		driver.findElement(By.id("createContactForm_generalCity")).sendKeys("NewYork");
		driver.findElement(By.id("createContactForm_generalPostalCode")).sendKeys("600010");
		driver.findElement(By.id("createContactForm_generalPostalCodeExt")).sendKeys("14");
		
		driver.findElement(By.name("submitButton")).click();	
		
		
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateContactForm_birthDate")).clear();
		driver.findElement(By.id("updateContactForm_birthDate")).sendKeys("18/04/93");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		System.out.println(driver.getTitle());
		
		WebElement update = driver.findElement(By.xpath("//input[@class=\'smallSubmit\']"));
		update.click();
		
		
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}

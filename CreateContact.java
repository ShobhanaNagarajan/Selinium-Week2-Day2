package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateContact {
	public static void main(String[]args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login ");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
	
	WebElement userName = driver.findElement(By.id("username"));
	userName.sendKeys("demosalesmanager");

	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("crmsfa");
	WebElement login = driver.findElement(By.className("decorativeSubmit"));
	login.click();
	WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
	crmsfa.click();
	
	
	WebElement contactsButton = driver.findElement(By.linkText("Contacts"));
	contactsButton.click();
	WebElement CreateContact = driver.findElement(By.linkText("Create Contact"));
	CreateContact.click();
    
	driver.findElement(By.id("firstNameField")).sendKeys("shobhi");
	driver.findElement(By.id("lastNameField")).sendKeys("N");
	driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("shobhi");
	driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("nagraj");
	driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
	driver.findElement(By.id("createContactForm_description")).sendKeys("selenium ");
	driver.findElement(By.id("createContactForm_birthDate")).sendKeys("18/04/1993");
  
	WebElement currencyDropdown = driver.findElement(By.id("createContactForm_preferredCurrencyUomId"));
	Select Currency = new Select(currencyDropdown);
	Currency.selectByValue("INR");
	
	driver.findElement(By.xpath("//input[@id='createContactForm_description']")).sendKeys("Hi");
	driver.findElement(By.id("createContactForm_importantNote")).sendKeys("Hello");
	
	WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	Select drop = new Select(state);
	drop.selectByVisibleText("Indiana");
	
	driver.findElement(By.id("createContactForm_generalCity")).sendKeys("NewYork");
	driver.findElement(By.id("createContactForm_generalPostalCode")).sendKeys("600010");
	driver.findElement(By.id("createContactForm_generalPostalCodeExt")).sendKeys("14");

	WebElement update = driver.findElement(By.id("updateContactForm_importantNote"));
	update.clear();
	
	

	
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	System.out.println(driver.getTitle());

	
	driver.close();
}
}

	
		

	



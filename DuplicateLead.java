package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//a[@class ='x-tab-right'])[3]")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("ennkaeyy@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//a[@href='/crmsfa/control/viewLead?partyId=10651'])")).click();
		String oldName = driver.findElement(By.xpath("//span[text()='Naresh']")).getText();
		System.out.println("The first name before duplication is " +oldName);
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String newName = driver.findElement(By.xpath("//span[text()='Naresh']")).getText();
		System.out.println("The first name after duplication is " +newName);
		driver.close();
		
	}

}

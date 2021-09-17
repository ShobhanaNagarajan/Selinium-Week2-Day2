package week2.day2;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceLogin {

	public static void main(String[] args) {
		{
			WebDriverManager.chromedriver().setup();
			ChromeDriver  driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
					
			driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
					
			driver.findElement(By.name("UserFirstName")).sendKeys("Shobhana");
			driver.findElement(By.name("UserLastName")).sendKeys("N");
			driver.findElement(By.name("UserEmail")).sendKeys("shophiya18@gmail.com");
			driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
			driver.findElement(By.name("UserPhone")).sendKeys("8870184994");
					
			WebElement jobTitleDropdown = driver.findElement(By.name("UserTitle"));
			Select jobTitle = new Select(jobTitleDropdown);
			jobTitle.selectByValue("Marketing / PRManager");
					
			WebElement employeesDropdown = driver.findElement(By.name("CompanyEmployees"));
			Select employees = new Select(employeesDropdown);
			employees.selectByIndex(3);
					
			driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
			driver.close();
					
					

				}

		
			
			
			
			
	}
}



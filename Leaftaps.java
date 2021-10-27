package week2.day1;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Leaftaps {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
        ChromeDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://Leaftaps.com/opentaps/control/main");
		
	
		
		//username Textbox
		WebElement usernameBox=driver.findElement(By.id("username"));
		usernameBox.sendKeys("demosalesmanager");
		//Password TextBox
		WebElement passwordBox=driver.findElement(By.id("password"));
		passwordBox.sendKeys("crmsfa");
		//login
		
		WebElement LoginButton=driver.findElement(By.className("decorative submit"));
		LoginButton.click();
		
		
		
	
		
		
	 driver.findElement (By.linkText("create lead")).click();
		  driver .findElement(By.id("create lead from_companyName")).sendKeys("Testleaf");
		  driver .findElement(By.id("create lead from_FirstName")).sendKeys("Shobhana");
		  driver .findElement(By.id("create lead from_LastName")).sendKeys("N");
		  driver .findElement(By.id("create lead from_First Name(local)")).sendKeys("Shobhi");
		  driver .findElement(By.id("create lead from_Title")).sendKeys("Ms");
		  driver .findElement(By.id("create lead from_Annual Revenue")).sendKeys("300000");
		  driver .findElement(By.id("create lead from_Birth Date")).sendKeys("18/04/1993");
		  driver .findElement(By.id("create lead from_Title")).sendKeys("ME");
		  driver .findElement(By.id("create lead from_industry")).sendKeys("Computer Software");
		  driver .findElement(By.id("create lead from_Sic Code")).sendKeys("00234");
		  driver .findElement(By.id("create lead from_Description")).sendKeys(
		  		"looking forward for responsible position");
		  driver .findElement(By.id("create lead from_importantNote")).sendKeys("Hardworking");
		  driver .findElement(By.id("create lead from_numberEmpolyee")).sendKeys("21");
		  driver .findElement(By.id("create lead from_ticketSymbol")).sendKeys("MSFT");
		  
		    
		  	  		  
		  		  
		
	WebElement countrycode=driver.findElement(By.id("createLeadFrom_PrimaryPhoneCountryCode"));	
				  
				   countrycode.clear();
				   countrycode.sendKeys("+91");
				      driver .findElement(By.id("create lead from_PrimaryAreaCode")).sendKeys("100");
				      driver .findElement(By.id("create lead from_PrimaryPhoneNumber ")).sendKeys("9952347352");
				      driver .findElement(By.id("create lead from_primaryExtension")).sendKeys("963");
				      driver.findElement(By.id("create lead from _primary WebUrl")).sendKeys("www.google.com");
				      driver .findElement(By.id("create lead from_primaryPersonToAsk")).sendKeys("May I contact Shobhana");
				      driver .findElement(By.id("create lead from_primaryEmail")).sendKeys("shophiya18@gmail.com");
				      driver .findElement(By.id("create lead from_primaryWebUrl")).sendKeys("www.google.com");
				     
				      driver .findElement(By.id("create lead from_primary Name")).sendKeys("Shobhana");
				      driver.findElement(By.id("create lead from_ primary AddressLine1")).sendKeys("SBI colony");
				      driver .findElement(By.id("create lead from_primary AddressLine2")).sendKeys("Bharathipuram");
				      driver .findElement(By.id("create lead from_primary City")).sendKeys("Dharmapuri");
				      driver .findElement(By.id("create lead from_primary State")).sendKeys("TamilNadu");
				      driver .findElement(By.id("create lead from_primary Postal Code")).sendKeys("636705");
				      driver .findElement(By.id("create lead from_primary Country")).sendKeys("India");
				      driver .findElement(By.id("create lead from_primary PostalCode Extenstion")).sendKeys("96");
				      
				      
				      
		driver.findElement(By.name("submitButton")).click();
		String sname= driver.findElement(By.id("viewLead_firstName")).getText();
		System.out.println("firstname:+sname");		   
		String title2 = driver.getTitle();
		System.out.println("title:"+title2);
		//driver.close();
	}

}

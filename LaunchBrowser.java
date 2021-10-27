package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		
			
		ChromeDriver  driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://Leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		System.out.println("title:"+title);
	
		
		//username Textbox
		WebElement usernameBox=driver.findElement(By.id("username"));
		usernameBox.sendKeys("demosalesmanager");
		
		driver.findElement(By.xpath("//input@id='username']")).sendKeys("demosalesmanager");
		
		WebElement passwordBox=driver.findElement(By.id("password"));
		passwordBox.sendKeys("crmsfa");
		driver.findElement(By.xpath("//input@id='password']")).sendKeys("crmsfa");
		
		WebElement LoginButton=driver.findElement(By.className("decorative submit"));
		LoginButton.click();
		driver.findElement(By.xpath("//input@type='decorativesubmit']"));
		
		
		WebElement crmsfaHyperLink=driver.findElement(By.linkText("CRM/SFA"));
		crmsfaHyperLink.click();
		driver.findElement(By.xpath("//input@type='CRM/SFA']"));
			

		String title1 = driver.getTitle();
		System.out.println("title:"+title1);
		
		// TODO Auto-generated method stub

	}

}

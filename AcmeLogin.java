package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeLogin {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver  driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
        driver.get("https://acme-test.uipath.com/login");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shophiya@gmail.com");;
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf");
        driver.findElement(By.xpath("//input[@id='remember']")).click();
        
        System.out.println(driver.getTitle());
        driver.findElement(By.name("submit")).click();
        driver.close();
        
	}

}

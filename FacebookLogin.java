package week2.day2;




import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class FacebookLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		driver.get("https://en-gb.facebook.com/");
		WebElement CreateNewAccount = driver.findElement(By.linkText("Create New Account"));
		CreateNewAccount.click();
		
		WebElement firstName= driver.findElement(By.xpath("//input[@name=\'firstname\']"));
		firstName.sendKeys("shobhi");
		WebElement lastName =driver.findElement(By.xpath("//input[@name=\'lastname\']"));
		lastName.sendKeys("Nagaraj");
		WebElement reg_email =driver.findElement(By.xpath("//input[@name=\'reg_email__']"));
		reg_email.sendKeys("shophiya18@gmail.com");
		WebElement reg_email_conformation =driver.findElement(By.xpath("//input[@name=\'reg_email_confirmation__']"));
		reg_email_conformation.sendKeys("shophiya18@gmail.com");
		WebElement passWord = driver.findElement(By.id("password_step_input")); 
		passWord.sendKeys("sobi934");
		
		WebElement day = driver.findElement(By.id("day"));
		Select selectDate = new Select(day);
		selectDate.selectByValue("18");
		
		WebElement month = driver.findElement(By.id("month"));
		Select selectMonth = new Select(month);
		selectMonth.selectByValue("4");
		
		WebElement year = driver.findElement(By.id("year"));
		Select selectYear = new Select(year);
		selectYear.selectByValue("1993");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		driver.findElement(By.name("websubmit")).click();
	}
}
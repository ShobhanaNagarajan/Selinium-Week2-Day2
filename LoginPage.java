package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		
			
		ChromeDriver  driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("title:"+title);
		
		

	}

}

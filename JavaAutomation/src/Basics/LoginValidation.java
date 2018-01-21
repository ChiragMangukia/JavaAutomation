package Basics;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginValidation {

	public static void main(String[] args) {
		
		File filePath = new File("BrowserDrivers", "chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", filePath.getAbsolutePath());
		
		WebDriver driver = new ChromeDriver();
		
		String tarUrl = "https://login.salesforce.com/";
		driver.get(tarUrl);
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("chiragmangukia");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		
		String curUrl = driver.getCurrentUrl();
		if(tarUrl.equals(curUrl)) {
			String errText = driver.findElement(By.cssSelector("#error")).getText();
			System.out.println(errText);			
		}
		else {
			System.out.println("Login Success");
		}
		
		driver.close();

	}

}

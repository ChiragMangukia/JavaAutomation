package Basics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginValidation {

	public static void main(String[] args) throws IOException {
				
		WebDriver driver = myMethods.Driver();
		
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
		myMethods.killProcess();

	}

}

package Basics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginValidation {
	
	private static WebDriver driver = myMethods.Driver();

	public static void main(String[] args) throws IOException {
		try {
			loginValidation();
		} finally {
			driver.close();
			myMethods.killProcess();
		}
	}
	
	private static void loginValidation() {
		
		String tarUrl = "https://login.salesforce.com/";
		driver.get(tarUrl);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("chiragmangukia");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("mypassword");
		driver.findElement(By.cssSelector("#Login")).click();
		
		String curUrl = driver.getCurrentUrl();
		if(tarUrl.equals(curUrl)) {
			String errText = driver.findElement(By.cssSelector("#error")).getText();
			System.out.println(errText);			
		} else {
			System.out.println("Login Success");
		}
		
	}

}

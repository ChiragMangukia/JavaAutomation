package Basics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkbox {

	private static WebDriver driver = myMethods.Driver();
	
	public static void main(String[] args) throws IOException {
		
		try {
			checkBox();
		} finally {
			myMethods.killProcess();
		}

	}
	
	private static void checkBox() {
		
		driver.get("http://www.spicejet.com");
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
	}

}

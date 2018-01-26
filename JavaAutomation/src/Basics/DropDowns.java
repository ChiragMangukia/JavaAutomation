package Basics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	private static WebDriver driver = myMethods.Driver();
	
	public static void main(String[] args) throws IOException {
		
		try {
			dropDown();
			doubleDropDown();
		} finally {
			myMethods.killProcess();
		}

	}
	
	private static void dropDown() {
		
		driver.get("http://www.spicejet.com");
		
		Select select = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		//select.selectByValue("6");		//Selects based on value of the code
		//select.selectByIndex(5);			//Selects based on Index   
		select.selectByVisibleText("6");	//Selects based on Visible Text
		
	}
	
	private static void doubleDropDown() {
		
		//driver.get("http://www.spicejet.com");
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("(//a[@value='STV'])[2]")).click();
		
	}

}
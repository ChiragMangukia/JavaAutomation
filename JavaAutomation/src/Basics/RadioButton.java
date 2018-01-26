package Basics;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButton {

	private static WebDriver driver = myMethods.Driver();
	
	public static void main(String[] args) throws IOException {
		
		try {
			radioButton();
		} finally {
			myMethods.killProcess();
		}
		
	}
	
	private static void radioButton() {
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		System.out.println(count);
		
	}

}

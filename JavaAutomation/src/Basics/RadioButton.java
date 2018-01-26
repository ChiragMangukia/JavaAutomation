package Basics;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButton {

	private static WebDriver driver = myMethods.Driver();
	
	public static void main(String[] args) throws IOException {
		
		try {
			//radioButton();
			radioButtonDynamically();
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
	
	private static void radioButtonDynamically() {
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for(int i=0; i<count; i++) {
			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			System.out.println(text);
			
			if(text.equals("Cheese")) {
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}
		
	}

}

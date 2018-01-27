package Basics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptAlert {

	private static WebDriver driver = myMethods.Driver();
	
	public static void main(String[] args) throws IOException {
		try {
			javascriptAlert();
		} finally {
			myMethods.killProcess();
		}

	}
	
	private static void javascriptAlert() {
		
		File file = new File("Misc", "JavascriptAlert.html");
		String fileUrl = file.getAbsolutePath();
		
		driver.get(fileUrl);
		
		String alertText = driver.findElement(By.xpath("//button[text()='Try it']")).getText();
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().alert().dismiss();
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println("Alertbox Text : " + alertText);
		System.out.println(text);
		
		//driver.findElement(By.id("demo")).sendKeys("Alertbox Input"); To give inputs in alertbox
	}

}

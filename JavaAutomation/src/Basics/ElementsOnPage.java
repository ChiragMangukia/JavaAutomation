package Basics;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsOnPage {

	private static WebDriver driver = myMethods.Driver();
	
	public static void main(String[] args) throws IOException {
		
		try {
			elementVisibility();
			//elementPresent();
		} finally {
			myMethods.killProcess();
		}
		
	}
	
	private static void elementVisibility() throws IOException {
		
		myMethods myMethodsObj = new myMethods();
		driver.get("https://www.makemytrip.com");
		
		boolean beforeClick = driver.findElement(By.id("hp-widget__return")).isDisplayed();
		System.out.println(beforeClick);
		myMethodsObj.Screenshot(driver, "E:\\Automation\\Git\\JavaAutomation\\JavaAutomation\\Screenshots\\BeforeClick.jpg");
		driver.findElement(By.xpath("//*[@id='multicity']/label")).click();
		boolean afterClick= driver.findElement(By.id("hp-widget__return")).isDisplayed();
		System.out.println(afterClick);
		myMethodsObj.Screenshot(driver, "E:\\Automation\\Git\\JavaAutomation\\JavaAutomation\\Screenshots\\AfterClick.jpg");
	}
	
	private static void elementPresent() {
		
		driver.get("https://www.makemytrip.com");
		
		int elementSize = driver.findElements(By.id("hp-widget__return")).size();
		
		if(elementSize > 0) {
			System.out.println("Element is present on Webpage");
		} else {
			System.out.println("Element is not present on Webpage");
		}
		
	}

}

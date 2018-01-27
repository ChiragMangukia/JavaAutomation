package Basics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethod {

	private static WebDriver driver = myMethods.Driver();
	
	public static void main(String[] args) throws IOException {
		
		try {
			actionsMethod();
		} finally {
			myMethods.killProcess();
		}

	}
	
	private static void actionsMethod() {
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		WebElement textBox = driver.findElement(By.id("twotabsearchtextbox"));
		
		actions.moveToElement(textBox).click().keyDown(Keys.SHIFT).sendKeys("entered in small letters").doubleClick().build().perform();
		
	}

}

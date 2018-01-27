package Basics;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	private static WebDriver driver = myMethods.Driver();
	
	public static void main(String[] args) throws IOException {
		
		try {
			mouseHover();
		} finally {
			myMethods.killProcess();
		}

	}
	
	private static void mouseHover() {
		
		driver.get("https://www.amazon.in");
		
		Actions actions = new Actions(driver);
		WebElement signIn = driver.findElement(By.id("nav-link-prime"));
		actions.moveToElement(signIn).build().perform();
		
	}

}

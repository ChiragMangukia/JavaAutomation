package Basics;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		File filePath = new File("BrowserDrivers", "chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", filePath.getAbsolutePath());
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("chiragmangukia");
		//driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		Thread.sleep(10000);
		driver.close();
	}

}

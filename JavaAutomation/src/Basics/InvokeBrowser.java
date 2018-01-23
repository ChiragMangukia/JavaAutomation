package Basics;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		File filePath = new File("BrowserDrivers", "chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", filePath.getPath());
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("chiragmangukia");
		Thread.sleep(3000);
		driver.close();
		//Runtime.getRuntime().exec("taskkill /F /IM ChromeDriver.exe");
	}

}

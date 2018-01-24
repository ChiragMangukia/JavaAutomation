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
		
		driver.manage().window().maximize();
		
		String webPage = "https://www.facebook.com";
		driver.get(webPage);
		driver.getTitle();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		driver.findElement(By.id("email")).sendKeys("chiragmangukia");
		
		Thread.sleep(2000);
		
		myMethods myMethodsObj = new myMethods();
		myMethodsObj.Screenshot(driver, "E:\\Automation\\Git\\JavaAutomation\\JavaAutomation\\Misc\\MyAutomationScreenshot.png");
		
		driver.close();
		Runtime.getRuntime().exec("taskkill /F /IM ChromeDriver.exe");
	}

}

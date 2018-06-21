package Basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myMethods {
	
	public void Screenshot(WebDriver webElement, String pathName) throws IOException {		
		File file = ((TakesScreenshot)webElement).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(pathName));		
	}
	
	public static WebDriver Driver() {
		File filePath = new File("BrowserDrivers", "chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", filePath.getPath());		
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static void killProcess() throws IOException {
		Runtime.getRuntime().exec("taskkill /F /IM ChromeDriver.exe");
	}

}
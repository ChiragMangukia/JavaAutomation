package Basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class myMethods {
	
	public void takeScreenshot(String pathName, WebDriver webElement) throws IOException {
		
		File file = ((TakesScreenshot)webElement).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(pathName));
		
	}

}

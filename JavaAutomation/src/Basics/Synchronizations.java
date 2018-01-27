package Basics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Synchronizations {

	private static WebDriver driver = myMethods.Driver();
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		try {
			implicitWait();
		} finally {
			myMethods.killProcess();
		}

	}
	
	private static void implicitWait() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com");
		
		//driver.findElement(By.xpath("//input[@name='flight_origin_city']")).click();
		driver.findElement(By.xpath("//input[@name='flight_origin_city']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//input[@name='flight_origin_city']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@name='flight_origin_city']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='flight_origin_city']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@name='flight_destination_city']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@name='flight_destination_city']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@name='flight_destination_city']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='flight_destination_city']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\"a_2018_1_31\"]/span[1]")).click();
		driver.findElement(By.id("BE_flight_flsearch_btn")).click();
		driver.findElement(By.xpath("//div[@class='new-ttlFare']/p[2]/span")).click();
	}

}

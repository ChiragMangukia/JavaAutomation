package Basics;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableGrid {
	
	private static WebDriver driver = myMethods.Driver();

	public static void main(String[] args) throws IOException {
				
		try {
			tableGrid();
		} finally {
			myMethods.killProcess();
		}

	}
	
	private static void tableGrid() {
				
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18723/paku19-vs-rsau19-super-league-quarter-final-2-d1-v-a2-icc-under-19-world-cup-2018");
		
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));		
		int rowCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for(int i=0; i<rowCount; i++) {
			System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
		}
		
	}

}

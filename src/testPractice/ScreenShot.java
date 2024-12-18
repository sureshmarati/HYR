package testPractice;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws Throwable {
		Calendar cal = Calendar.getInstance();
		java.util.Date time = cal.getTime();
		String timestamp = time.toString().replace(":", "").replace(" ", "");
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File suresh = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(suresh, new File("C:\\Users\\marat\\eclipse-workspace\\HYR\\ScreenShots//"+timestamp+" suresh.png"));
		

	}

}

package testPractice;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TesttestTest {
    public static void main(String[] args) throws InterruptedException, Throwable {
//        // Open the browser
//       FirefoxDriver driver = new FirefoxDriver();
//       driver.get("https://www.google.com");
//       Thread.sleep(4000);
//       
//        // Resize the browser
//        Dimension d = new Dimension(400, 560);
//        driver.manage().window().setSize(d);
//        Thread.sleep(4000);
//        
//        // Move the browser
//       Point p = new Point(300, 600);
//       driver.manage().window().setPosition(p);
//       Thread.sleep(4000);
//
//        // Maximize the browser
//        driver.manage().window().maximize();
//        // Close the browser
//        driver.quit();
//    	ChromeDriver driver = new ChromeDriver();
//    	driver.navigate().to("https://www.google.com");
//    	Dimension d = new Dimension(134, 900);
//    	driver.manage().window().setSize(d);
//    	Thread.sleep(3000);
//    	driver.manage().window().maximize();
//    	driver.navigate().back();
//    	Thread.sleep(3000);
//    	Point p = new Point(123, 189);
//    	driver.manage().window().setPosition(p);
//    	Thread.sleep(3000);
//    	driver.navigate().forward();
//    	Thread.sleep(3000);
//    	driver.navigate().refresh();
//    	ChromeDriver driver = new ChromeDriver();
//    	Dimension d = new Dimension(600, 800);
//    	driver.manage().window().setSize(d);
//    	Thread.sleep(3000);
//    	Point p = new Point(23, 190);
//    	driver.manage().window().setPosition(p);
//    	Thread.sleep(2000);
//    	driver.navigate().to("https://www.google.com");
//    	Thread.sleep(3000);
//    	driver.navigate().back();
//    	Thread.sleep(2000);
//    	driver.navigate().forward();
//    	String title = driver.getTitle();
//    	if(title.equalsIgnoreCase("google"))
//    	{
//    		System.out.println("Pass google");   		
//    	}else
//    	{
//			System.out.println("fail google navigation");   		
//    	}
//    	String URL = driver.getCurrentUrl();
//    	if(URL.contains("goo"))
//    	{
//    		System.out.println("Url is google");
//    	}else
//    	{
//    		System.out.println("Url is not google");
//    	}
    	ChromeDriver driver = new ChromeDriver();
    	driver.get("https://www.google.com");
    	driver .manage().window().maximize();
    	TakesScreenshot ts =  driver;
    	File MS = ts.getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(MS, new File("C:\\Users\\marat\\eclipse-workspace\\HYR\\ScreenShots//imag.png"));
    	}
}
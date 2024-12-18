package testPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_9 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/radio-buttons");
		driver.findElement(By.id("blue")).click();
		WebElement blue = driver.findElement(By.id("blue"));
		if(blue.isSelected()) {
			blue.click();
			System.out.println("removed");
		
		}
		driver.findElement(By.id("red")).click();
	}

}

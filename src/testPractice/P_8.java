package testPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_8 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
//		driver.findElement(By.name("login"));
//		WebElement UsernameTXT = driver.findElement(By.id("login_field"));
//		if(UsernameTXT.isDisplayed()) {
//			if(UsernameTXT.isEnabled()) {
//				UsernameTXT.sendKeys("Suresh");
//				String enteredText = UsernameTXT.getAttribute("value");
//				System.out.println(enteredText);
//			}else
//			{
//				System.out.println("is not enabled");
//			}
//			}else 
//			{
//				System.out.println("is not displayed");
//				
//			}
		driver.findElement(By.id("password"));
		WebElement testing = driver.findElement(By.id("password"));
		if(testing.isDisplayed()) {
			if(testing.isEnabled()) {
				testing.sendKeys("12345");
				String enteredText = testing.getAttribute("Value");
				System.out.println(enteredText);
			}
			System.out.println("is displayed");
		}else
		{
			System.out.println("not displayed");
		}
		}
}

	
	



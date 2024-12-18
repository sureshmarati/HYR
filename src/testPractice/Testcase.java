package testPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase {

	public static void main(String[] args) throws InterruptedException 
	{
WebDriver driver = new FirefoxDriver();
driver.get("https://github.com/login");
driver.manage().window().maximize();
Thread.sleep(4000);
Thread.sleep(1000);
WebElement username = driver.findElement(By.id("login_field"));
if(username.isDisplayed()) {
	if(username.isEnabled()) {
		username.sendKeys("suresh");
		Thread.sleep(3000);
		username.sendKeys("navya");
		String enteredtext = username.getAttribute("value");
		System.out.println(enteredtext);
		Thread.sleep(3000);
		username.clear();		
	}else {
		System.out.println("user name is not enabled");
	}
	
}else {
	System.out.println("username is not displayed");
}	
	}

}


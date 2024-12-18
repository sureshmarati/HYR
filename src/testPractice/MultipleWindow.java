package testPractice;

import java.time.Duration;
import java.util.Set;

import org.apache.poi.poifs.property.Child;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindow {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/selenium-automation-testing-jobs-in-hyderabad-secunderabad?k=selenium%20automation%20testing&l=hyderabad");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/nav/ul/li[3]/a/div")));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/nav/ul/li[3]/a/div")).click();
		//System.out.println(driver.getWindowHandles());
		Set<String> windows = driver.getWindowHandles();
		for (String child : windows) {
			System.out.println(child);
			System.out.println(driver.getTitle());
			driver.switchTo().window(child);
			
		}
		driver.findElement(By.xpath("//*[@id=\"fj\"]/span")).click();
		driver.close();
	}

}

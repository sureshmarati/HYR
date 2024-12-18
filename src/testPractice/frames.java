package testPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		System.out.println(frame.size());
		WebElement frame1 = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame1);
		WebElement drg = driver.findElement(By.id("draggable"));
		WebElement drp = driver.findElement(By.id("droppable"));
		Actions ac = new Actions(driver);
		ac.dragAndDrop(drg, drp).build().perform();

	}

}

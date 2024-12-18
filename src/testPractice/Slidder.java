package testPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slidder {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		WebElement slide = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		driver.switchTo().frame(slide);
		Actions ac = new Actions(driver);
		ac.clickAndHold(slide).moveByOffset(50, 02).release(slide).build().perform();
		}

}

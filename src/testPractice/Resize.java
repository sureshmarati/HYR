package testPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		WebElement resize = driver.findElement(By.xpath("//*[@id=\"resizable\"]"));
		Actions ac = new Actions(driver);
		ac.clickAndHold(resize).moveByOffset(700,100).release(resize).build().perform();
		
		
	}

}

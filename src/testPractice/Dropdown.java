package testPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new FirefoxDriver();
//driver.get("https://www.hyrtutorials.com/");
driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
driver.manage().window().maximize();
//driver.findElement(By.id("course")).click();
//WebElement courseElement = driver.findElement(By.id("course"));
//Select test = new Select(courseElement);
//test.selectByIndex(3);
//Thread.sleep(4000);
//test.selectByValue("net");
//Thread.sleep(3000);
//test.selectByVisibleText("Javascript");
//System.out.println(test.getFirstSelectedOption().getText());
 WebElement ideElement =driver.findElement(By.id("ide"));
 Select IdeNamedropdown = new Select(ideElement);
 IdeNamedropdown.selectByIndex(0);
 IdeNamedropdown.selectByValue("vs");
 List<WebElement> option = IdeNamedropdown.getAllSelectedOptions();
 
 for(WebElement element:option)
 {
	 System.out.println(element.getText());
 }
 
 
 List<Object> l=new ArrayList<>();
 
 l.add("vasu");
 
 l.add(1);
 for (Object x : l) 
 {
	 System.out.println(x);
	
}
 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 

	}

}

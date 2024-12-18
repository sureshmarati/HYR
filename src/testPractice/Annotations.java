package testPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations 
{
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}
	@Test
	public void execute()
	{
		System.out.println("TestExecute");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Aftermethod");
	}
}

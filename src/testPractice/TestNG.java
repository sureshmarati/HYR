package testPractice;

import org.testng.annotations.Test;

public class TestNG
{
	@Test
	void Setup()
	{
		System.out.println("test123");
	}
	@Test
	 void Login()
	{
		System.out.println("Login Test");
	}
	@Test
	 void Teardown()
	{
		System.out.println("Logout");
	}
}

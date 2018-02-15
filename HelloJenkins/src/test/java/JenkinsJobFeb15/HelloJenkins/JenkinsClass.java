package JenkinsJobFeb15.HelloJenkins;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JenkinsClass {
	@Before
	public void login()
	{
		System.out.println("Login Window of Web");
	}
	@Test
	public void addTocart()
	{
		System.out.println("Add to Shopping Cart");
	}
	@After
	public void logout()
	{
		System.out.println("Logout of the web");
	}
}

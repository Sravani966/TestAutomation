package testNG;

import static org.testng.Assert.fail;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonMethods{
	@Test
	public void signup()
	{
		System.out.println("signup is successfull");
	}
	@Test(dependsOnMethods="signup")
	public void login()
	{
		Assert.fail();
		System.out.println("login is successfull");
	}
	@Test(dependsOnMethods="login")
	public void homepage()
	{
		System.out.println("homepage is successfull");
	}
	@Test(dependsOnMethods="homepage")
	public void logout()
	{
		System.out.println("logout is successfull");
	}
}

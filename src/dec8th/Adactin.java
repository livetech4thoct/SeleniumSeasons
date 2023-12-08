package dec8th;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Adactin {
	
	@Test(priority=1)
	public void loginTest()
	{
		System.out.println("Browser Started ..");
		System.out.println("App Launched ..");
		Assert.assertTrue(true);
		System.out.println("Login Successfull....");
		System.out.println("Browser closed ...");
	}
	
	@Test(priority=0)
	public void registrationTest()
	{
		System.out.println("Browser Started ..");
		System.out.println("App Launched ..");
		System.out.println("Registration is Sucessfull..");
		System.out.println("Browser closed ...");
	}
	
	@Test(priority=2)
	public void forgotPassword()
	{
		System.out.println("Browser Started ..");
		System.out.println("App Launched ..");
		System.out.println("Forgot password successfull..");
		System.out.println("Browser closed ...");
	}
	
	@Test(priority = 3,dependsOnMethods="loginTest")
	public void changePasswordTest()
	{
		System.out.println("Browser Started ..");
		System.out.println("App Launched ..");
		System.out.println("Change password successfull...");
		System.out.println("Browser closed ...");
	}

}

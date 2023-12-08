package dec8th;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Adactin2 {
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Browser Started ..");
		System.out.println("App Launched ..");
	}
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("Browser closed ...");
	}
	
	@Test(priority=1)
	public void loginTest()
	{
		
		Assert.assertTrue(true);
		System.out.println("Login Successfull....");
		
	}
	
	@Test(priority=0)
	public void registrationTest()
	{
		
		System.out.println("Registration is Sucessfull..");
		
	}
	
	@Test(priority=2)
	public void forgotPassword()
	{
		
		System.out.println("Forgot password successfull..");
		
	}
	
	@Test(priority = 3,dependsOnMethods="loginTest")
	public void changePasswordTest()
	{
		
		System.out.println("Change password successfull...");
		
	}

}

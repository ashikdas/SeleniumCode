package frameworke_implementation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_testNG {
	
	// https://www.toolsqa.com/testng/testng-asserts/

		//hard assertion: 
		//hard validation: if a hard assertion is getting failed: immediately test case will me marked as failed and test case will be terminated.
		//Assert.assertEquals(true, false);
		
		// soft assertion : soft validation: if a soft assertion is getting failed: test case will not be marked as passed as well as next lines will be executed
		// assertAll() : is used to mark the test case as failed, if any soft assertion is getting failed
		// softAssert Class creation
	
	@Test
	public static void testcase1(){
		
		SoftAssert softAssert = new SoftAssert();
		
		
		System.out.println("Open the browser");
//		Assert.assertEquals(true, true);
		softAssert.assertEquals(true, false);
		
		System.out.println("visit in a sign in page");
//		Assert.assertEquals(false, true);
		softAssert.assertEquals(1, 1);
		
		System.out.println("enter username");
		softAssert.assertEquals(1, 2);

		System.out.println("enter password");
		softAssert.assertEquals(true, false);

		System.out.println("sign in button");
		
		softAssert.assertAll();
	}
	
	@Test
	public static void testcase2()
	
	{
		SoftAssert softAssert=new SoftAssert();
		
		System.out.println("order page visit");
		softAssert.assertEquals(true, true);
		System.out.println("order a product");
		softAssert.assertAll();
	}

	@Test
	public static void testcase3()
	{
		SoftAssert softAssert=new SoftAssert();
		System.out.println("contact page visit");
		softAssert.assertEquals(true, false);
		System.out.println("suggest a message");
		softAssert.assertAll();
	}

}

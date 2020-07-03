package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.*;

public class DemoClass {
	@BeforeTest
	public void beforetest()
	{
		System.out.println("In Before Test Method");
	}
	@Test
	public void verifyFail()
	{
		System.out.println("In Test Method");
		Assert.assertTrue(6<3);
	}

	@AfterTest
	public void afterTest()
	{
		System.out.println("In After Test Method");
	}


}

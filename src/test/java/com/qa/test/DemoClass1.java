package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.*;

public class DemoClass1 {
	@Test
	public void verifyPass()
	{
		Assert.assertEquals(2, 2);
		System.out.println("Testcase passed");
	}
	
	@Test
	public void verifyEqual()
	{
		Assert.assertEquals(2, 2);
		System.out.println("Testcase passed");
	}
}

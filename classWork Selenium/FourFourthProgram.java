package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FourFourthProgram {
	@BeforeSuite
	public void bS()
	{
		System.out.println("Before suite");
	}
	@BeforeTest
	public void bT()
	{
		System.out.println(" Before test");
	}
	@BeforeClass
	public void bC()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void bM()
	{
		System.out.println("Before Method");
	}
	@Test
	public void login()
	{
		System.out.println("test");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("After Method");
	}
	@AfterClass
	public void aC()
	{
		System.out.println(" After Clas");
	}
	@AfterTest
	public void aT()
	{
		System.out.println("After Test");
	}
	@AfterSuite
	public void aS()
	{
		System.out.println("After Suite");
	}

}

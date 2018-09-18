package com.dataprovider;

import org.testng.annotations.DataProvider;

public class LoginDataprovider 
{
	@DataProvider(name="dp1")
	public static Object[][] getData()
	{
		Object[][] obj = {
				         	{"mercury","mercury"},
				         	{"Test123","Pass123"}
						 };
		return obj;
	}
}

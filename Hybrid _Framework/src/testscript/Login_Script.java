package testscript;

import org.testng.annotations.Test;

import generic.Fetch_Data;
import generic.Generic_Class;
import pom.POM;

public class Login_Script extends Generic_Class 
{
	@Test
	public void test1(Object btn)
	{
		String UN=Fetch_Data.get_data("Sheet1", 0, 0);
		String PWD=Fetch_Data.get_data("Sheet1", 0, 1);
		POM p = new POM(driver);
//p.equals(UN);
//p.equals(PWD);
//p.equals(btn);
		
		
	}

}

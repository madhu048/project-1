package Testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.AppFunctions;

public class OrangeHRM extends AppFunctions
{
	@Test
	@Parameters({"firstname","middlename","lastname","employeename","username","password"})
	public void orangHRM(String firstname,String middlename,String lastname,String employeename,String username,String password) throws InterruptedException
	{
		AppFunctions fn= new AppFunctions();
		fn.addNewEmployee(firstname,firstname,firstname);
		fn.providingLoginDetails(username, employeename, password);
	}

}

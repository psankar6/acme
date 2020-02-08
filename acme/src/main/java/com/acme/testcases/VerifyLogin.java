package com.acme.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.acme.pages.LoginPage;
import com.acme.testng.api.base.ProjectSpecificMethod;

public class VerifyLogin extends ProjectSpecificMethod{
	
	@Parameters({"uname","pwd"})
	@Test
	public void verifylogin(String uname, String pwd) {
		
		
		new LoginPage()
		.enterusername(uname)
		.enterpassword(pwd)
		.clicksubmitbutton()
		.gettitle()
		.CloseBrowser();
	}
	
	

}

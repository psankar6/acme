package com.acme.pages;

import com.acme.testng.api.base.ProjectSpecificMethod;


public class LoginPage extends ProjectSpecificMethod{
	
	
		public LoginPage enterusername(String uname) {

			driver.findElementById("email").sendKeys(uname);
			
			return this;

		}

		public LoginPage enterpassword(String pwd) {

			driver.findElementById("password").sendKeys(pwd);
			return this;

		}


		public HomePage clicksubmitbutton() {
			driver.findElementById("buttonLogin").click();
			return new HomePage();

			
		}


	}
	
	
	

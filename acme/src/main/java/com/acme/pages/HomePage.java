package com.acme.pages;

import com.acme.testng.api.base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{
	
	public HomePage gettitle() {
		
		String title= driver.getTitle();
		System.out.println(title);
        return this;
	}
	
	
	
	//<title>ACME System 1 - Dashboard</title>
	
	

}

package com.syntax.testcases;

import org.testng.annotations.Test;

import com.syntax.pages.LoginPage;
import com.syntax.pages.LoginPageWithFindBy;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginPageWithFindByTest extends BaseClass{

	@Test
	public void loginToOrangeHRM() {
		LoginPage login=new LoginPage();
		
		CommonMethods.sendText(login.username, "Admin");
		CommonMethods.sendText(login.password, "06I@PjFbgM");
		CommonMethods.click(login.btnLogin);
		
	}
	
	@Test
	public void doLogin() {
		LoginPageWithFindBy login=new LoginPageWithFindBy();
		CommonMethods.sendText(login.userName, ConfigsReader.getProperty("username"));
		CommonMethods.sendText(login.password, ConfigsReader.getProperty("password"));
		CommonMethods.click(login.loginBtn);
	}
}
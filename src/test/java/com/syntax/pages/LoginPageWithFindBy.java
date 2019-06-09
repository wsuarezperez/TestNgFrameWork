package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class LoginPageWithFindBy extends BaseClass {
//locating webelement using @FindBy annotation
	@FindBy(id="txtUsername")
	public WebElement userName;
	
	@FindBy (name="txtPassword")
	public WebElement password;
	
	@FindBy (id="btnLogin")
	public WebElement loginBtn;
	
	@FindBy (css= "img[src*='logo.png']")
	public WebElement logo;
	
	//initialize all of our variables with Contructor
	public LoginPageWithFindBy() {
		PageFactory.initElements(driver, this);
		
	}
	
}

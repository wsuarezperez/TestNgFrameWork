package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class PIMPage extends BaseClass {

	@FindBy(xpath = "//span[contains(text(),'PIM')]")
	public WebElement PIM;

	@FindBy(id = "menu_pim_addEmployee")
	public WebElement addEmp;

	@FindBy(id = "firstName")
	public WebElement fName;

	@FindBy(id = "lastName")
	public WebElement lName;

	@FindBy(id = "systemUserSaveBtn")
	public WebElement nextBtn;


public PIMPage() {
	PageFactory.initElements(driver, this);
}


}

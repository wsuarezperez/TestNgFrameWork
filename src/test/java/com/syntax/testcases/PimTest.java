package com.syntax.testcases;

import org.testng.annotations.Test;

import com.syntax.pages.HomePage;
import com.syntax.pages.LoginPage;
import com.syntax.pages.PIMPage;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

public class PimTest extends BaseClass {

	@Test
	public void enterPim() {
		LoginPage login = new LoginPage();
		HomePage home = new HomePage();
		PIMPage pim = new PIMPage();
		
		CommonMethods.click(pim.PIM);
		CommonMethods.click(pim.addEmp);
		CommonMethods.sendText(pim.fName, "Wil");
		CommonMethods.sendText(pim.lName, "Perez");
		CommonMethods.click(pim.nextBtn);

	}
}

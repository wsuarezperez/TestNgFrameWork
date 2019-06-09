package com.syntax.testcases;

import org.testng.annotations.Test;

import com.syntax.pages.AssignLeavePage;
import com.syntax.utils.BaseClass;

public class AssignLeaveTest extends BaseClass {

	@Test
	public void ClickOnLeave() throws InterruptedException {

		AssignLeavePage leave = new AssignLeavePage();

		leave.leaveOption.click();
		leave.assgLeave.click();
		

	}
}

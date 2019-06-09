package com.syntax.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class AssignLeavePage extends BaseClass{

public WebElement leaveOption=driver.findElement(By.linkText("Leave"));	
public WebElement assgLeave = driver.findElement(By.linkText("Assign Leave"));
	
}

package com.syntax.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.syntax.pages.LoginPage;

public class BaseClass {

	public static WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public static void setUp() {

		ConfigsReader.readProperties(Constants.CREDENTIALS_FILEPATH);
		String browser = ConfigsReader.getProperty("browser");// chrome browser

		if (browser.equalsIgnoreCase("chrome")) {
			// For mac
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			// for windows
			// System.setProperty("webdriver.chrome.driver",
			// "src/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		} else {
			System.out.println("browser given is wrong");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// driver.manage().window().fullscreen(); for mac
		driver.manage().window().maximize();
		driver.get(ConfigsReader.getProperty("url"));
		
		LoginPage login = new LoginPage();
		CommonMethods.sendText(login.username, "Admin");
		CommonMethods.sendText(login.password, "H@3P7JreqG");
		CommonMethods.click(login.btnLogin);
		
	}

	@AfterMethod(alwaysRun = true)
	public static void tearDown() {
		driver.quit();
	}
}
package com.qaprosoft.carina.demo;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.gui.common.HomePageBase;
import com.qaprosoft.carina.demo.gui.common.LoginPageBase;

public class BaseTest extends AbstractTest {
	protected HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
	
	@BeforeMethod
	public void openMainPage() {
		
		homePage.open();
		Assert.assertTrue(homePage.isPageOpened(), "Base page is not opened!");
	}
	
	public LoginPageBase webLogin(String login, String password) {
		LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
		loginPage.getLoginItem().typeEmail(login);
        loginPage.getLoginItem().typePassword(password);
        return loginPage;
	}
	

}

package com.qaprosoft.carina.demo.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.LoginPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderMenu extends AbstractUIObject {

    @FindBy(xpath = "//*[@class='login']")
    private ExtendedWebElement signInButton;

    public HeaderMenu(WebDriver driver, SearchContext searchContext){
        super(driver, searchContext);
    }


    public LoginPage openLoginPage(){
        signInButton.click();
        return new LoginPage(driver);
    }




}

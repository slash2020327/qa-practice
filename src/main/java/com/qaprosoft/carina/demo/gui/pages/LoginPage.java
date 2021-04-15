package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.Authentication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//div[@id='center_column']")
    private Authentication authentication;

    public LoginPage(WebDriver driver){
        super(driver);
        setPageAbsoluteURL("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }



    public Authentication getAuthentication(){
        return authentication;
    }


}

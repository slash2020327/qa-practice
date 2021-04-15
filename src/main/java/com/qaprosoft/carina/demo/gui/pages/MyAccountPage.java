package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends AbstractPage {

    public MyAccountPage(WebDriver driver){
        super(driver);
        setPageAbsoluteURL("http://automationpractice.com/index.php?controller=my-account");
    }


}

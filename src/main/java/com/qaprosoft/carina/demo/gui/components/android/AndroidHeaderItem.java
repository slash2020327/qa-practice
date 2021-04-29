package com.qaprosoft.carina.demo.gui.components.android;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.common.LoginPageBase;
import com.qaprosoft.carina.demo.gui.common.SearchResultsPageBase;
import com.qaprosoft.carina.demo.gui.components.common.HeaderItem;


public class AndroidHeaderItem extends HeaderItem {
    @FindBy(xpath = "//a[@class='login']")
    private ExtendedWebElement loginButton;

    @FindBy(xpath = "//input[@id='search_query_top']")
    private ExtendedWebElement searchField;

    @FindBy(xpath = "//*[@name='submit_search']")
    private ExtendedWebElement searchButton;

    public AndroidHeaderItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public LoginPageBase openLoginPage() {
        loginButton.click();
        return initPage(getDriver(), LoginPageBase.class);
    }
    
    @Override
    public SearchResultsPageBase searchProduct(String item){
        searchField.type(item);
        searchButton.click();
        return initPage(getDriver(), SearchResultsPageBase.class);
    }
}

package com.qaprosoft.carina.demo.gui.components;

import com.qaprosoft.carina.demo.gui.pages.SearchResultsPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.LoginPage;

import java.util.List;

public class HeaderItem extends AbstractUIObject {
    @FindBy(xpath = "//a[@class='login']")
    private ExtendedWebElement loginButton;

    @FindBy(xpath = "//input[@id='search_query_top']")
    private ExtendedWebElement searchField;

    @FindBy(xpath = "//*[@name='submit_search']")
    private ExtendedWebElement searchButton;



    public HeaderItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public LoginPage openLoginPage() {
        loginButton.click();
        return new LoginPage(driver);
    }

    public SearchResultsPage clickSearch(String item){
        searchField.type(item);
        searchButton.click();
        return new SearchResultsPage(driver);
    }




}

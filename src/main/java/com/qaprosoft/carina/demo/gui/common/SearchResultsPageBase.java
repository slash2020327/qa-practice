package com.qaprosoft.carina.demo.gui.common;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.demo.gui.BasePage;

import java.util.List;

public abstract class SearchResultsPageBase extends BasePage {
    public SearchResultsPageBase(WebDriver driver){
        super(driver);
    }

    public abstract List<?> getProductList();
}

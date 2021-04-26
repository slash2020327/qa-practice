package com.qaprosoft.carina.demo.gui.android.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.android.pages.ProductPage;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class ProductItem extends AbstractUIObject {

    @FindBy(xpath = "//div[@class='product-container']")
    private ExtendedWebElement productItem;

    @FindBy(xpath = "//span[contains(text(),'More')]")
    private ExtendedWebElement productLink;

    public ProductItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public String getTitle() {
        return productItem.getElement().getText();
    }

    public ProductPage openProductPage() {
        productLink.click();
        return new ProductPage(driver);
    }
}

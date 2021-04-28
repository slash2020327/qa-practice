package com.qaprosoft.carina.demo.gui.components.desktop;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.BaseItem;
import com.qaprosoft.carina.demo.gui.common.ProductPageBase;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class ProductItem extends BaseItem {

    @FindBy(xpath = "//div[@class='product-container']")
    private ExtendedWebElement productItem;

    @FindBy(xpath = ".//a[@class='product-name']")
    private ExtendedWebElement productLink;

    public ProductItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public String getTitle() {
        return productItem.getElement().getText();
    }

    public ProductPageBase openProductPage() {
        productLink.click();
        return initPage(getDriver(), ProductPageBase.class);
    }
}

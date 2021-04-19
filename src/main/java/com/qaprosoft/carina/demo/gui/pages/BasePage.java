package com.qaprosoft.carina.demo.gui.pages;

import org.apache.commons.collections.CollectionUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.HeaderItem;
import com.qaprosoft.carina.demo.gui.components.ProductItem;
import org.testng.Assert;
import java.util.List;

public class BasePage extends AbstractPage {
    @FindBy(xpath = "//header")
    private HeaderItem header;
    
    @FindBy(xpath="//div[@class='product-container']")
	private List<ProductItem> products;

    public BasePage(WebDriver driver) {
        super(driver);
    }

    public HeaderItem getHeader() {
        return header;
    }
    
    public List<ProductItem> getProducts() {
		Assert.assertFalse(CollectionUtils.isEmpty(products), "No products found!");
		return products;
	}
}

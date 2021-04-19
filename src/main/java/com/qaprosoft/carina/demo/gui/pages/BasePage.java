package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.HeaderItem;
import com.qaprosoft.carina.demo.gui.components.ProductItem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
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
		return products;
	}
}

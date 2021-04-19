package com.qaprosoft.carina.demo.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.ProductPage;

public class ProductItem extends AbstractUIObject {
	@FindBy(xpath=".//a[@class='product-name']")
	private ExtendedWebElement productLink;

	public ProductItem(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	 	
	public ProductPage openProductPage() {
		productLink.click();
		return new ProductPage(driver);
	}
	
}
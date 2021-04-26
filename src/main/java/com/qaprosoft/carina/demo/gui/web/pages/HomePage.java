package com.qaprosoft.carina.demo.gui.web.pages;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.qaprosoft.carina.demo.gui.BasePage;
import com.qaprosoft.carina.demo.gui.web.components.ProductItem;

public class HomePage extends HomeBasePage {
	@FindBy(xpath="//div[@class='product-container']")
	private List<ProductItem> products;

	public HomePage(WebDriver driver) {
		super(driver);
	}
    
    public List<ProductItem> getProducts() {
		Assert.assertFalse(CollectionUtils.isEmpty(products), "No products found!");
		return products;
	}
}

package com.qaprosoft.carina.demo.gui.pages.desktop;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.qaprosoft.carina.demo.gui.BaseItem;
import com.qaprosoft.carina.demo.gui.common.HomePageBase;

public class HomePage extends HomePageBase {
	@FindBy(xpath="//div[@class='product-container']")
	private List<BaseItem> products;

	public HomePage(WebDriver driver) {
		super(driver);
	}
    
	@Override
    public List<BaseItem> getProducts() {
		Assert.assertFalse(CollectionUtils.isEmpty(products), "No products found!");
		return products;
	}
}

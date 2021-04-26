package com.qaprosoft.carina.demo.gui.android.pages;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.gui.android.components.ProductItem;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomeBasePage.class)
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

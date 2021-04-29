package com.qaprosoft.carina.demo.gui.pages.android;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.gui.common.HomePageBase;
import com.qaprosoft.carina.demo.gui.components.android.AndroidProductItem;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {
	@FindBy(xpath="//div[@class='product-container']")
	private List<AndroidProductItem> products;

	public HomePage(WebDriver driver) {
		super(driver);
	}
    
	@Override
    public List<AndroidProductItem> getProducts() {
		Assert.assertFalse(CollectionUtils.isEmpty(products), "No products found!");
		return products;
	}
}

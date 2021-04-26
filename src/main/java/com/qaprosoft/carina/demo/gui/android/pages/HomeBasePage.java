package com.qaprosoft.carina.demo.gui.android.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.gui.BasePage;
import com.qaprosoft.carina.demo.gui.android.components.HeaderItem;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = BasePage.class)
public class HomeBasePage extends BasePage{
	@FindBy(xpath = "//header")
    private HeaderItem header;

	public HomeBasePage(WebDriver driver) {
		super(driver);
	}

	public HeaderItem getHeader() {
		return header;
	}

}

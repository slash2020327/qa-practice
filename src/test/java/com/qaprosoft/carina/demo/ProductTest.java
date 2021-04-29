package com.qaprosoft.carina.demo;

import java.lang.invoke.MethodHandles;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.common.AddressPageBase;
import com.qaprosoft.carina.demo.gui.common.ConfirmedOrderPageBase;
import com.qaprosoft.carina.demo.gui.common.LoginPageBase;
import com.qaprosoft.carina.demo.gui.common.OrderSummaryPageBase;
import com.qaprosoft.carina.demo.gui.common.PaymentPageBase;
import com.qaprosoft.carina.demo.gui.common.ProductPageBase;
import com.qaprosoft.carina.demo.gui.common.ShippingPageBase;
import com.qaprosoft.carina.demo.gui.components.common.ProductItem;
import com.qaprosoft.carina.demo.gui.pages.desktop.LoginPage;

public class ProductTest extends BaseTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	@Test
    @MethodOwner(owner = "Tsekhanovich")
    public void testProduct() throws InterruptedException {
		List<ProductItem> products = (List<ProductItem>) homePage.getProducts();
		int rand = (int)(Math.random() * products.size());
		ProductPageBase productPage = products.get(rand).openProductPage();
		
		productPage.selectRandomColor();
		productPage.selectRandomSize();
		productPage.addProduct();
		Assert.assertTrue(productPage.getOkIcon().isVisible(), "Product has not been added");
		
		productPage.clickProceedButton().clickProceedButton();
        AddressPageBase addressPage = webLogin(R.TESTDATA.get("test_login_value"), 
        		R.TESTDATA.get("test_password_value")).getLoginItem().confirmOrderLogin();
        ShippingPageBase shippingPage = addressPage.clickProceedButton();
        PaymentPageBase paymentPage = shippingPage.clickProceedButton();
        OrderSummaryPageBase orderSummaryPage = paymentPage.clickWireButton();
        
        ConfirmedOrderPageBase confirmedOrderPage = orderSummaryPage.clickWireButton();
        Assert.assertTrue(confirmedOrderPage.isPageOpened(), "Order summary page is not opened!");
        Assert.assertEquals(confirmedOrderPage.getInfoMessage().getText(), R.TESTDATA.get("test_success_order_message"));
        
        LOGGER.info("Product has been purchased!");
    }
}

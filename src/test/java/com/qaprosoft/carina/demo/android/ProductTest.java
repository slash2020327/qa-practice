package com.qaprosoft.carina.demo.android;

import java.lang.invoke.MethodHandles;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.android.components.ProductItem;
import com.qaprosoft.carina.demo.gui.android.pages.AddressPage;
import com.qaprosoft.carina.demo.gui.android.pages.ConfirmedOrderPage;
import com.qaprosoft.carina.demo.gui.android.pages.OrderSummaryPage;
import com.qaprosoft.carina.demo.gui.android.pages.PaymentPage;
import com.qaprosoft.carina.demo.gui.android.pages.ProductPage;
import com.qaprosoft.carina.demo.gui.android.pages.ShippingPage;
public class ProductTest extends BaseTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	@Test
    @MethodOwner(owner = "Tsekhanovich")
    public void testProduct() throws InterruptedException {
		List<ProductItem> products = homePage.getProducts();
		
		int rand = (int)(Math.random() * products.size());
		ProductPage productPage = products.get(rand).openProductPage();
		
		productPage.selectRandomColor();
		productPage.selectRandomSize();
		productPage.addProduct();
		Assert.assertTrue(productPage.getOkIcon().isVisible(), "Product has not been added");
		
		productPage.clickProceedButton().clickProceedButton();
        AddressPage addressPage = login(R.TESTDATA.get("test_login_value"), 
        		R.TESTDATA.get("test_password_value")).getLoginItem().confirmOrderLogin();        
        ShippingPage shippingPage = addressPage.clickProceedButton();
        PaymentPage paymentPage = shippingPage.clickProceedButton();
        OrderSummaryPage orderSummaryPage = paymentPage.clickWireButton();
        
        ConfirmedOrderPage confirmedOrderPage = orderSummaryPage.clickWireButton();
        Assert.assertTrue(confirmedOrderPage.isPageOpened(), "Order summary page is not opened!");
        Assert.assertEquals(confirmedOrderPage.getInfoMessage().getText(), R.TESTDATA.get("test_success_order_message"));
        
        LOGGER.info("Product has been purchased!");
    }
}

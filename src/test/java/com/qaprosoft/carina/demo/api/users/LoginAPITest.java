package com.qaprosoft.carina.demo.api.users;


import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.api.PostUserMethod;

public class LoginAPITest extends AbstractTest {
	
	@Test
	public void loginTest() throws InterruptedException {
		PostUserMethod postUserMethod1 = new PostUserMethod();
		
		postUserMethod1.setHeaders("Cookie=PrestaShop-a30a9934ef476d11b6cc3c983616e364=BEDPL9C6N6MR6B2VY%2BIS5rmLL83qrK1lXVqjLIaUPChrQ%2BNA9XHp1hYd0YwSZcH%2F1N57O0BnchdOndK3MPwegc6KFMqsRH7RPMKEsmFpNDPzx5Y8UQb0uR4goNt3GVuSC8BHNV9YACbwPKs8udwTGZ1mp74y3utXKci3GRYoSTGnp8QkF1BV86M9NMtiZughL8dAmkz1s2YtWOznCWyGOh1yNS8waz2Ove%2BP04N0JEeVCuHhA9%2FGySpaciObzEWiYYMOQTRn4p267Q8bpaJqP1u6nIhlajrOYfhprUTA5qPa%2F4FTTQP0G6aJfMDYn2z%2FPBP2jvPa6recPYno7hSz6kkiOeiOBAGqQ60Kr7U2idZuAHuLu8dUIWdrrE0tcrlMcfzz24xHCgVNEOXKM5xit5jf4RELBIqyrciI%2FODYAt%2FyLmU8MaK1h7PwapephwequUIlCMEkMDfABQGlI7vn9Vf2cbI3z%2FMc9W7YyTPebh7DvJnpJXvR%2FVe4e5BXro3%2F000374");
		postUserMethod1.callAPI();
	}
}





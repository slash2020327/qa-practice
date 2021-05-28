package com.qaprosoft.carina.demo.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetUserMethod extends AbstractApiMethodV2 {
	public GetUserMethod() {
		super("api/users/_get/rq.json", "api/users/_get/user_rs.json", "api/users/_get/users.properties");
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
	
	public GetUserMethod(long userId) {
		this();
		replaceUrlPlaceholder("user_id", String.valueOf(userId));
	}
}

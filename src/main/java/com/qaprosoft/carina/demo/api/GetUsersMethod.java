package com.qaprosoft.carina.demo.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetUsersMethod extends AbstractApiMethodV2 {
	public GetUsersMethod() {
		super("api/users/_get/rq.json", "api/users/_get/users_rs.json", "api/users/_get/users.properties");
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}

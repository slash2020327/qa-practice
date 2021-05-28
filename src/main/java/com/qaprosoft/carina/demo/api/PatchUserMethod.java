package com.qaprosoft.carina.demo.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PatchUserMethod extends AbstractApiMethodV2 {
	public PatchUserMethod() {
		super("api/users/_patch/rq.json", "api/users/_patch/rs.json", "api/users/_patch/users.properties");
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
	
	public PatchUserMethod(long userId) {
		this();
		replaceUrlPlaceholder("user_id", String.valueOf(userId));
	}
}

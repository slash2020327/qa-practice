package com.qaprosoft.carina.demo.api.practice;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostUserMethodPractice extends AbstractApiMethodV2 {
	public PostUserMethodPractice() {
		super("api/users/_post/rq.json", "api/users/_post/rs.json", "api/users/_post/users.properties");
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("end_url"));
	}
}

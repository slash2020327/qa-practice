package com.qaprosoft.carina.demo.api.users;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.demo.api.GetUserMethod;
import com.qaprosoft.carina.demo.api.GetUsersMethod;
import com.qaprosoft.carina.demo.api.PatchUserMethod;
import com.qaprosoft.carina.demo.api.PostUserMethod;

public class UsersAPITest extends AbstractTest {
	@Test
	public void getUsersTest() {
		GetUsersMethod getUsersMethod = new GetUsersMethod();
		getUsersMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		String email = JsonPath.read(getUsersMethod.callAPI().asString(), "$.data[?(@.id==2)].email").toString();
		assertEquals("[\"janet.weaver@reqres.in\"]", email);
		getUsersMethod.validateResponse();
	}
	
	@Test
	public void getUserTest() {
		GetUserMethod getUserMethod = new GetUserMethod(1);
		getUserMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		getUserMethod.callAPI();
		getUserMethod.validateResponse();
	}
	
	@Test
	public void getWrongUserTest() {
		GetUserMethod getUserMethod = new GetUserMethod(44);
		getUserMethod.expectResponseStatus(HttpResponseStatusType.NOT_FOUND_404);
		getUserMethod.callAPI();
		getUserMethod.setResponseTemplate("api/users/_get/rq.json");
		getUserMethod.validateResponse();
	}
	
	@Test
	public void postUserTest() {
		PostUserMethod postUserMethod = new PostUserMethod();
		postUserMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
		String id = JsonPath.read(postUserMethod.callAPI().asString(), "$.id");
		postUserMethod.validateResponse();
		assertTrue(Integer.parseInt(id)>15);
	}
	
	@Test
	public void patchUserTest() {
		PatchUserMethod patchUserMethod = new PatchUserMethod(2);
		patchUserMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		String date = JsonPath.read(patchUserMethod.callAPI().asString(), "$.updatedAt");
		patchUserMethod.validateResponse();
	}
	
	
}

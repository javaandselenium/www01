package CURD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetOperation {
	@Test
	public void tc1() {
		Response resp = RestAssured.get("http://localhost:3000/posts");
	ValidatableResponse response = resp.then();
	response.log().all();
	
	}

}

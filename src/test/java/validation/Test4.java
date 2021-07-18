package validation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.ValidatableResponse;

public class Test4 {
	@Test
	public void tc1() {
		String data = given()
		.get("http://localhost:3000/posts")
		.jsonPath().get("[2].author");
		System.out.println(data);
}
}
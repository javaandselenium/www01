package validation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test0 {
	@Test
	public void tc1() {
		given()
		.get("http://localhost:3000/posts")
		.then().log().all()
		.assertThat().statusCode(201)
		.contentType(ContentType.JSON)
		.assertThat().header("Keep-Alive","timeout=5")
		.assertThat().header("Content-Length","673");
		
	}
}

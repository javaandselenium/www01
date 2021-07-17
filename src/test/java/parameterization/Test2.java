package parameterization;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void demo() {
		given()
		.auth().oauth2("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")
		.param("q","SeleniumWCSE2")
		.param("order","asc")
		.param("sort","stars")
		
		.get("https://api.github.com/search/repositories")
		.then().log().all();
		
	}
}

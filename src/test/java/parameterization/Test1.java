package parameterization;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test1 {
	@Test
	public void demo() {
		given()
		.auth().oauth2("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")
		.queryParam("q","SeleniumWCSE2")
		.queryParam("order","asc")
		.queryParam("sort","stars")
		
		.get("https://api.github.com/search/repositories")
		.then().log().all();
		
	}

}

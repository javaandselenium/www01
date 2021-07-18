package validation;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void tc1() {
		given()
		.get("http://localhost:3000/posts")
		.then().log().all()
		.assertThat().body("[3].title",equalTo("APItesting"))
		.assertThat().body("[2].author",containsString("john"))
		.assertThat().body("[5].id",is(900))
		.assertThat().body("[6].id",equalTo(9000));
		
		
}
}

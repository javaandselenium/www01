package validation;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void tc1() {
		given()
		.get("http://localhost:3000/posts")
		.then().log().all()
		.assertThat().body("[3].title",Matchers.equalTo("APItesting"))
		.assertThat().body("[2].author",Matchers.containsString("john"))
		.assertThat().body("[5].id",Matchers.is(900))
		.assertThat().body("[6].id",Matchers.equalTo(9000));
		
		
}}

package validation;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test3 {
	@Test
	public void tc1() {
		given()
		.get("http://localhost:3000/posts")
		.then().log().all()
		.assertThat().statusCode(200)
		.contentType(ContentType.JSON)
		.assertThat().header("Keep-Alive","timeout=5")
		.assertThat().header("Content-Length","673")
		.assertThat().body("[3].title",equalTo("APItesting"))
		.assertThat().body("[2].author",containsString("john"))
		.assertThat().body("[5].id",is(900))
		.assertThat().body("[6].id",equalTo(9000));
}}

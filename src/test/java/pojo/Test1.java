package pojo;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test1 {
	@Test
	public void tc2() {
		//Content type based seralization
		Project p=new Project(10000,"api","Om","Divya","OP");
		
		given()
		.contentType(ContentType.JSON)
		.body(p)
		.post(" http://localhost:3000/posts")
		.then().log().all();
	}
}

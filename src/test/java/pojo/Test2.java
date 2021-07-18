package pojo;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test2 {
	@Test
	public void tc2() {
		HashMap<String,Object>map=new HashMap<String, Object>();
		map.put("id","234");
		map.put("title","qwerty6");
		
		given()
		.contentType(ContentType.JSON)
		.body(map)
		.post(" http://localhost:3000/posts")
		.then().log().all();
}
}
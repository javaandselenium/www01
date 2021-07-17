package CURD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostOpertaion {
	@Test
	public void tc2() {
		JSONObject j=new JSONObject();
		j.put("id",9087);
		j.put("title","apiweekend124");
		
		RequestSpecification request = RestAssured.given();
		request.contentType(ContentType.JSON);
		request.body(j);
		Response resp = request.post("http://localhost:3000/posts");
	    resp.then().log().all();
	}

}

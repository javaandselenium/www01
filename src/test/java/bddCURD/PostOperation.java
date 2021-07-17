package bddCURD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostOperation {
@Test
public void tc2() {
	JSONObject j=new JSONObject();
	j.put("id",980);
	j.put("title","OM");
	
	given()
	.contentType(ContentType.JSON)
	.body(j)
	.post(" http://localhost:3000/posts")
	.then().log().all();
}
}

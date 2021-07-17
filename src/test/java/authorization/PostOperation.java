package authorization;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostOperation {
@Test
public void tc2() {
	JSONObject j=new JSONObject();
	j.put("name","wwwwwww01repro");
	j.put("description","dummy repro");
	
	given()
	.auth().oauth2("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")
	
	.contentType(ContentType.JSON)
	.body(j)
	.post("https://api.github.com/user/repos")
	.then().log().all();
}
}

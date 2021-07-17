package authorization;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PatchOperation {
	@Test
	public void tc3() {
		JSONObject j=new JSONObject();
		j.put("private",false);
		
		given()
		.auth().oauth2("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")
		.contentType(ContentType.JSON)
		.body(j)
		.patch("https://api.github.com/repos/javaandselenium/wwwwwww01repro")
		.then().log().all();
		
	}

}

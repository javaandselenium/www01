package bddCURD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class PatchOperation {
@Test
public void tc3() {
	JSONObject j=new JSONObject();
	j.put("title","qwertyOM");
	
  given()
  .contentType(ContentType.JSON)
  .body(j)
  .patch(" http://localhost:3000/posts/980")
  .then().log().all();

}
}

package bddCURD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetOperation {
@Test
public void tc1() {
	given()
	.get("http://localhost:3000/posts")
	.then().log().all();
}
}

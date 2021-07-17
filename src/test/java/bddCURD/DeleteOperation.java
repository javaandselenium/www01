package bddCURD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class DeleteOperation {
@Test
public void tc3() {
	given()
	.delete("http://localhost:3000/posts/980")
	.then().log().all();
}
}

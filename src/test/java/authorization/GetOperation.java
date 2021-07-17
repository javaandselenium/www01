package authorization;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetOperation {
@Test
public void tc1() {
	given()
	.get("https://api.github.com/repos/javaandselenium/Gitproject")
	.then().log().all();
}
}

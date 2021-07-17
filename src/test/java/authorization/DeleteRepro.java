package authorization;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class DeleteRepro {
	@Test
	public void tc4() {
		given()
		.auth().oauth2("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")
	.delete("https://api.github.com/repos/javaandselenium/wwwwwww01repro")
	.then().log().all();
	}

}

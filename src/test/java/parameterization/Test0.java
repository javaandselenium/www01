package parameterization;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Test0 {
	@Test
	public void tc1() {
		given()
		.pathParam("ownerName","javaandselenium")
		.pathParam("repoName","SeleniumWCSE2")
		
		.get("https://api.github.com/repos/{ownerName}/{repoName}")
		.then().log().all();
	}
	}



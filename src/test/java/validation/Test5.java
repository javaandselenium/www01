package validation;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Test5 {
@Test
public void demo()
{
	 Response resp = given()
			.get("http://localhost:3000/posts");
		ArrayList<String> list=resp.jsonPath().get("author");
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
}
}

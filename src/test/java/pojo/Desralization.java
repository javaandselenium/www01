package pojo;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class Desralization {
	@Test
	public void tc2() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper=new ObjectMapper();
		 Project resp = mapper.readValue(new File("./data.json"),Project.class);
		System.out.println(resp.author);
		System.out.println(resp.firstname);
		System.out.println(resp.id);
		System.out.println(resp.lastname);
		System.out.println(resp.title);
	
	}

}

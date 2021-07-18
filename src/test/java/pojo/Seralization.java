package pojo;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class Seralization {
	@Test
	public void demo() throws JsonGenerationException, JsonMappingException, IOException {
	Project p=new Project(123,"qwerty","Johny","Kavya","KR");
	
	ObjectMapper mapper=new ObjectMapper();
	mapper.writeValue(new File("./data.json"),p);
	}

}

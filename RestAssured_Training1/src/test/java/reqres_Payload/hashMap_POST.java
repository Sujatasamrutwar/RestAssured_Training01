package reqres_Payload;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class hashMap_POST {

	@Test
	
	public void createUserHashmap() {
		
		HashMap<String, String> jbody = new HashMap<String, String>();
		jbody.put("name", "morpheus");
		jbody.put("job", "leader");
		
		//precondition
		given().contentType(ContentType.JSON)
		.body(jbody).log().all()
		
		//http method
		.when().post("https://reqres.in/api/users/2")
		
		//response
		
		.then().log().all();
	}
}

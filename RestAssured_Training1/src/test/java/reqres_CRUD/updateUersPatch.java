package reqres_CRUD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class updateUersPatch {

	@Test
	
	public void updateUser(){
		
		//pre-condition
		given().contentType(ContentType.JSON).body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}")
		
		//http method
		.when().put("https://reqres.in/api/users/2")
		
		//response
		.then().log().all();
	}
}

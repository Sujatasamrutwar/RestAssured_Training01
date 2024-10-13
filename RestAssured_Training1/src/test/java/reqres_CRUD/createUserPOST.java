package reqres_CRUD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType; 

public class createUserPOST {

	@Test
	
	public void createUser()
	{
		//pre-condition
		
		RestAssured.given().contentType(ContentType.JSON).body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}")
		
	//Http Method
		.when().post("https://reqres.in/api/users")
		
		//Reponse
		
		.then().log().all();
		
	}
}

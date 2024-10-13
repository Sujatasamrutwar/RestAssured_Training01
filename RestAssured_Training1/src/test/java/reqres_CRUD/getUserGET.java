package reqres_CRUD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class getUserGET {

	@Test
	
	public void getUser() {
		
		//pre-condition
		RestAssured.given()
		
		
		//http method
		.when().get("https://reqres.in/api/users?page=2")
		
		//response
		.then().log().all();
	}
	
}

package reqres_CRUD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class deleteUserDelete {

	@Test
	
	public void deleteUser() {
		
		//pre-condition
		given().contentType(ContentType.JSON)
		
		//http
		.when().delete("https://reqres.in/api/users/2")
		
		//response
		.then().log().all();
	}
}

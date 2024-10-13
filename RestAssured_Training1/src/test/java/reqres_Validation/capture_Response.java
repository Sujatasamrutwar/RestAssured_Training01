package reqres_Validation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;


public class capture_Response {
	@Test
public void getResponseValidate( ) {
		
		//precondition
		Response response = given()
		
		
		//http method 
		.when().get("https://reqres.in/api/users?page=2");
		
		System.out.println("total no f user" + response.jsonPath().getInt("data.size"));
}
}

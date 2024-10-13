package reqres_Validation;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Capture_Response_Reqres {

	@Test
	
	public void captureData() {
		
		Response response = given()
		
		
		.when().get("https://reqres.in/api/user?page=2");
		
		//int numberofUsers = response.jsonPath().getInt("data.size");
		 
		
		
		System.out.println("Total No of users" + response.jsonPath().getInt("data.size"));
	}
}
 
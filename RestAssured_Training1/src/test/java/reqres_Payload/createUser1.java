package reqres_Payload;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class createUser1 {

	@Test
	
	public void createUser2() {
		
	//precondition
		given()
		.header("Content-type","application/json")
		.body(createUserPayload.createUser())
		.log().all()
		
		//http method
		.when().post("https://reqres.in/api/register")
		
		//response
       .then().log().all();
	}

}

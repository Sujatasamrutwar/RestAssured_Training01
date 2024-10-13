package reqres_Validation;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;


public class reqresGetValidate {

	@Test
	
	public void getValidate( ) {
		
		//precondition
		given()
		
		//http method 
		.when().get("https://reqres.in/api/users?page=2")
		
		//response
		.then().log().all().assertThat()
		.statusCode(200)  
		.statusLine(containsString("OK"))
		.time(lessThan(2000l))
		.header("Server", equalTo("cloudflare"))
		.header("Content-Type", containsString("application/json"))
		.body("page", equalTo(2))
		.body("data[4].first_name", equalTo("George"));
		//.header("Content-Type", containsStringIgnoringCase("application/JSON"))
		
	}
}

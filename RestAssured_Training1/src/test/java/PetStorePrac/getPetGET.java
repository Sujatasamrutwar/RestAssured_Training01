package PetStorePrac;

import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;

public class getPetGET {

	@Test
	
	public void getPet() {
		
		//precondition
		given().pathParam("petId", "9223372016900027787")
		
		//http method
		.when().get("https://petstore.swagger.io/v2/pet/{petId}")
		
		//response
		.then().log().all();
	}
}

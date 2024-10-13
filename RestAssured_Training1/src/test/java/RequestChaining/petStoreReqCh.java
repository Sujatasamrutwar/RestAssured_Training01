package RequestChaining;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class petStoreReqCh {
		public long petId;	
	@Test
		public void createPet() {
			System.out.println("=============Create pet=============");
			File jsonFile = new File("./src/test/resources/petStoreCreatePet.json");
			
			//precondition 
			Response createpetResponse = given()
					.contentType(ContentType.JSON).body(jsonFile)
				
					
					//http method 
					
					.when()
					.post("https://petstore.swagger.io/v2/pet");
			
			createpetResponse.then().log().all();
			petId = createpetResponse.jsonPath().getLong("id");
			System.out.println("pet Id is : "+petId);
	}
	
	@Test(dependsOnMethods = "createPet")
	
	 public void getPet( ) {
			System.out.println("=============get pet=============");
			//precondition 
					given()
					.pathParam("petId", petId)
					
					//http method 
					.when().get("https://petstore.swagger.io/v2/pet/{petId}")
					
					//response
					.then().log().all();
					
		  }
}


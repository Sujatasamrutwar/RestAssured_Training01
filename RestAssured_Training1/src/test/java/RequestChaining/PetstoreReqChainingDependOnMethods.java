package RequestChaining;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;

public class PetstoreReqChainingDependOnMethods {
	
	public long petId;
	
@Test
	
	public void createPet() {
		System.out.println("=============Create pet=============");
		File jsonFile = new File("./src/test/resources/petStoreCreatePet.json");
		
		//precondition 
		Response createPetResponse = given()
				.contentType(ContentType.JSON).body(jsonFile)
			
				
				//http method 
				
				.when()
				.post("https://petstore.swagger.io/v2/pet");
		
		createPetResponse.then().log().all();
		petId = createPetResponse.jsonPath().getLong("id");
		System.out.println("pet Id is : "+petId);
}
	

   @Test(dependsOnMethods = "createPet")

     public void updatePet( ) {
	System.out.println("=============Update pet=============");
	//precondition 
			given()
			.pathParam("petId", petId)
			.formParam("name", "Scooby Dooby")
			.formParam("status", "Sold out")
			
			//http method 
			.when().post("https://petstore.swagger.io/v2/pet/{petId}")
			
			//response
			.then().log().all();
			
    }

     @Test(dependsOnMethods = "updatePet")

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
     
     @Test(dependsOnMethods = "getPet")

     public void deletePet( ) {
 	System.out.println("=============get pet=============");
 	//precondition 
 			given()
 			.pathParam("petId", petId)
 			
 			//http method 
 			.when().delete("https://petstore.swagger.io/v2/pet/{petId}")
 			
 			//response
 			.then().log().all();
 			
   }
}

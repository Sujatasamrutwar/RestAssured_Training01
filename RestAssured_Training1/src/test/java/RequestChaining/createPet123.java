package RequestChaining;

import static io.restassured.RestAssured.given; 

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class createPet123 {
	@Test
	public void createPet() throws IOException {
		System.out.println("=============Create pet=============");
		File jsonFile = new File("./src/test/resources/petStoreCreatePet.json");
		
		//precondition 
		Response createPetResponse = given()
				.contentType(ContentType.JSON).body(jsonFile)
			
				
				//http method 
				
				.when()
				.post("https://petstore.swagger.io/v2/pet");
		
		createPetResponse.then().log().all();
		long petId = createPetResponse.jsonPath().getLong("id");
		System.out.println("pet Id is : "+petId);
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/config.properties");
		
		Properties properties = new Properties();
		properties.setProperty("petId", "+petId");
		properties.store(fos, "pet Id is captured");
}

}

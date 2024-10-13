package handlingComplesJSON;

import org.testng.annotations.Test;

import POJONew.CategoryPetstore;
import POJONew.createPetPojo;
import POJONew.tagsPetstore;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;

public class CreatePetWithPOJO {

	@Test
	 
	public void createPet() {
		CategoryPetstore category = new CategoryPetstore(101, "Dog");
		
		ArrayList<String> photoUrls = new ArrayList<String>();
		photoUrls.add("https://google.com");
		
		tagsPetstore tags1 = new tagsPetstore(11, "abc");
		ArrayList<tagsPetstore> tags = new ArrayList<tagsPetstore>();
		tags.add(tags1);
		
		createPetPojo jsonbody2 = new createPetPojo(0, category, "Maggie", photoUrls, tags , "Available");
		
		//precondition
		given().contentType(ContentType.JSON).body(jsonbody2).log().all()
		
		//http method
		.when().post("https://petstore.swagger.io/v2/pet")
		
		//response
		.then().log().all();    
	}
}

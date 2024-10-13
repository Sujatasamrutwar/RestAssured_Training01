package reqres_Payload;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class requestBody_fromPOJO {

	@Test
	
	public void createUserPojo() {
		
		POJONew.createUserPojo userBody = new POJONew.createUserPojo();
		userBody.setJob("TE");
		userBody.setJob("Mahesh");
		
		//precondition
		
		given().contentType(ContentType.JSON).body(userBody).log().all()
		
		//http method
		
		.when().post("https://reqres.in/api/users")
		
		//response
		.then().log().all();
	}
}

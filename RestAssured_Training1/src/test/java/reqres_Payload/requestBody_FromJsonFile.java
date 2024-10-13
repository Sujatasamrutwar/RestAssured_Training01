package reqres_Payload;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class requestBody_FromJsonFile {

	@Test
	
	public void createUserJson() {
		File jsonfile = new File("./src/test/resources/createUser.json");
		
		//pre request
		given().contentType(ContentType.JSON).body(jsonfile)
		
		//http method
		
		.when()
		.post("https://reqres.in/api/users")
		
		//resposne
		
	.then().log().all();
	}
}

 package reqres_Payload;

	import org.testng.annotations.Test;

import POJONew.createUserPojo2;
import io.restassured.http.ContentType;

	import static io.restassured.RestAssured.*;

	public class requestBody2_fromPOJO { 

		@Test
		
		public void createUserPojo2() {
			
			createUserPojo2 userBody = new createUserPojo2("mahesh", "TE");
			
			
			//precondition
			
			given().contentType(ContentType.JSON).body(userBody).log().all()
			
			//http method
			
			.when().post("https://reqres.in/api/users")
			
			//response
			.then().log().all();
		}
	}


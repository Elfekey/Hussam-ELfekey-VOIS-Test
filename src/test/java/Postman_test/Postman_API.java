package Postman_test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
public class Postman_API {
	

	 
	@Test
	public void get_item_description() {
     //assertion using given and then 
		baseURI=("https://schema.getpostman.com/json");
		given().
			get("/collection/v2.0.0/collection.json").
		then().
			statusCode(200).
			body("properties.item.description", equalTo("Items are the basic unit for a Postman collection. You can think of them as corresponding to a single API endpoint. Each Item has one request and may have multiple API responses associated with it."));
		
		System.out.println("------------------- \n THIS The End of Second Test \n-------------------");

	}
	
	
	@Test
	public void get_auth_title() {
     //assertion using given and then 
		baseURI=("https://schema.getpostman.com/json");
		given().
			get("/collection/v2.0.0/collection.json").
		then().
			statusCode(200).
			body("definitions.auth.title", equalTo("Auth"));
			
		
		System.out.println("------------------- \n THIS The End of First Test \n-------------------");

	}



}

package ALLAPIS;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class APIPractice {
	@Test
	
	public void test() {


	
	Response response = RestAssured.get("https://reqres.in/api/users?page=1&id=1&email=george.bluth@reqres.in");
	System.out.println(response.statusCode());
	System.out.println(response.asString());
	System.out.println(response.getBody().asString());
	System.out.println(response.statusLine());

	int statusCode = response.getStatusCode();
	System.out.println("Status code is " +statusCode);
	System.out.println("Status code is " +response);
	Assert.assertEquals(statusCode, 200);

}
 
	@Test
	public void test1() {

		given().get("https://reqres.in/api/users?page=1&id=1&email=george.bluth@reqres.in").then().statusCode(200);
		//body("data.id[1]", equalTo(1));

	}




}



package apiTesting;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RestAssured.baseURI ="http://restapi.demoqa.com/customer";
		 RequestSpecification request = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("FirstName", "Anusha"); // Cast
		 requestParams.put("LastName", "Testing");
		 requestParams.put("UserName", "Anusha");
		 requestParams.put("Password", "password1");		 
		 requestParams.put("Email",  "Anusha@gmail.com");
		 
		 System.out.println(requestParams.toString());
		 
		 request.body(requestParams.toString());
		 Response response = request.post("/register");
		 
		 int statusCode = response.getStatusCode();
		 System.out.println(statusCode);
		 System.out.println(response.getBody().asString());
	}

}

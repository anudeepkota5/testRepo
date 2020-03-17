package apiTesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class deleteRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empid = 11111;
		 
		 RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		 RequestSpecification request = RestAssured.given(); 
		 
		 // Add a header stating the Request body is a JSON
		 request.header("Content-Type", "application/json");
		 
		 // Delete the request and check the response
		 Response response = request.delete("/delete/"+ empid); 
		 
		 int statusCode = response.getStatusCode();
		 System.out.println(statusCode);
		 System.out.println(response.asString());
	}

}

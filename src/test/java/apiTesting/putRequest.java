package apiTesting;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class putRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empid = 15410;
		 
		 RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1";
		 RequestSpecification request = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("name", "Zion"); // Cast
		 requestParams.put("age", 23);
		 requestParams.put("salary", 13000);
		 System.out.println(requestParams.toString());
		 
		 request.body(requestParams.toString());
		 Response response = request.put("/update/"+ empid);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println(statusCode);
		 System.out.println(response.asString());
		 
	}

}

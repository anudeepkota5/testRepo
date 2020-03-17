package apiTesting;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class apiauth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//test
		RestAssured.baseURI = "http://restapi.demoqa.com/authentication/CheckForAuthentication";
//		PreemptiveBasicAuthScheme auth = new PreemptiveBasicAuthScheme();
//		auth.setUserName("ToolsQA");
//		auth.setPassword("TestPassword");
//		RestAssured.authentication = auth;
		
		
		
		RequestSpecification request = RestAssured.given()
				.auth().basic("ToolsQA", "TestPassword");
		
		
		Response response = request.get();
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());
		
		JsonPath json = response.jsonPath();
		if(json.get("FaultId").equals("OPERATION_SUCCESS")){
			System.out.println("PASS");
		}
		System.out.println(json.get("FaultId").toString());
		
		List<String> auth = json.getList("author");
		auth.get(0);
		auth.get(5);
	}

}
